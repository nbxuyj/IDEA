package com.xuyj.platform.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bestvike.linq.Linq;
import com.mysql.cj.util.StringUtils;
import com.xuyj.platform.common.utils.ListPageUtil;
import com.xuyj.platform.db.entity.Department;
import com.xuyj.platform.db.mapper.DepartmentMapper;
import com.xuyj.platform.service.DepartmentService;
import com.xuyj.platform.service.entity.DepartmentListParam;
import com.xuyj.platform.service.entity.PageResult;
import lombok.var;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * @author openx
 * @description 针对表【department】的数据库操作Service实现
 * @createDate 2023-03-13 16:09:05
 */
@Service
@CacheConfig(cacheNames = "dep")
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
        implements DepartmentService {
    @Cacheable(cacheNames = {"dep"},keyGenerator = "myKeyGenerator")
    public List<Department> GetCacheAll() {
        return this.getBaseMapper().selectList(null);
    }

}




