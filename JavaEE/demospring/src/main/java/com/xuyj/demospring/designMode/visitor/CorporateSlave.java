package com.xuyj.demospring.designMode.visitor;

/**
 * 社畜类(企业上班员工类)
 */
public interface CorporateSlave {
    void accept(CorporateSlaveVisitor visitor);
}
