package com.xuyj.platform.service.cache;

import com.bestvike.linq.Linq;
import com.mysql.cj.util.StringUtils;
import com.xuyj.platform.common.utils.ListPageUtil;
import com.xuyj.platform.db.entity.Department;
import com.xuyj.platform.service.DepartmentService;
import com.xuyj.platform.service.entity.DepartmentListParam;
import com.xuyj.platform.service.entity.PageResult;
import lombok.var;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DepartmentServiceCache {
    @Resource
    DepartmentService service;
    public PageResult<Department> mySelectAll(DepartmentListParam param) {
        List<Department> departments = service.GetCacheAll();
        //拼接条件(参考：https://www.cnblogs.com/shadoll/p/14292909.html)。

        var ddd = Linq.of(departments).where(x -> StringUtils.isNullOrEmpty(param.getName()) && x.getDepartmentname().contains(param.getName()));
        ddd = Linq.of(ddd).where(x -> StringUtils.isNullOrEmpty(param.getTel()) && x.getTel().contains(param.getTel()));
        var list = ddd.toList();

        var pageList = new ListPageUtil<>(list, param.getPageNumber(), param.getPageSize());
        PageResult<Department> page = new PageResult<Department>(param.getPageNumber(), param.getPageSize());
        page.setRecords(pageList.getData());
        return page;

    }

    public Department getDep(Integer id) {
        System.out.println("查询" + id + "部门");
        List<Department> departments = service.GetCacheAll();
       // return this.getBaseMapper().selectById(id);
        return departments.stream().filter(p->p.getId()==id).findFirst().get();
    }
}
