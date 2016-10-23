/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.config.plan;

import java.util.List;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 160665
 */
@XmlRootElement(name = "Responsiblities")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponsibilityList {
    @XmlElement(name = "ResponsiblityRecord")
    private Set <Responsibility> responsiblities;
    @XmlAttribute
    private int noOfRecords;

    public Set<Responsibility> getResponsiblities() {
        return responsiblities;
    }

    public void setResponsiblities(Set<Responsibility> responsiblities) {
        this.responsiblities = responsiblities;
    }

    public int getNoOfRecords() {
        return noOfRecords;
    }

    public void setNoOfRecords(int noOfRecords) {
        this.noOfRecords = noOfRecords;
    }
        
}
