/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.pptx4j.pml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_PrintColorMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_PrintColorMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="bw"/>
 *     &lt;enumeration value="gray"/>
 *     &lt;enumeration value="clr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_PrintColorMode")
@XmlEnum
public enum STPrintColorMode {


    /**
     * 
     * 						Black and White Mode
     * 					
     * 
     */
    @XmlEnumValue("bw")
    BW("bw"),

    /**
     * 
     * 						Grayscale Mode
     * 					
     * 
     */
    @XmlEnumValue("gray")
    GRAY("gray"),

    /**
     * Color Mode
     * 
     */
    @XmlEnumValue("clr")
    CLR("clr");
    private final String value;

    STPrintColorMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STPrintColorMode fromValue(String v) {
        for (STPrintColorMode c: STPrintColorMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}