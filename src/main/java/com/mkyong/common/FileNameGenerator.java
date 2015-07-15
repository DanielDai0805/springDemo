package com.mkyong.common;

/**
 * Created by dc on 2015/7/15.
 *
 * How to inject value into bean properties in spring
 * Normal way
 *          <bean id="FileNameGenerator" class="com.mkyong.common.FileNameGenerator">
                 <property name="name">
                 <value>mkyong</value>
                 </property>
                 <property name="type">
                 <value>txt</value>
                 </property>
             </bean>
 * Shortcut
 *      <bean id="FileNameGenerator" class="com.mkyong.common.FileNameGenerator">
             <property name="name" value="mkyong" />
             <property name="type" value="txt" />
         </bean>
 * "p" schema
 *
 * <bean id="FileNameGenerator" class="com.mkyong.common.FileNameGenerator" p:name="mkyong" p:type="txt" />
 *
 */
public class FileNameGenerator {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
