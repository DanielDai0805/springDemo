package com.mkyong.di;

import com.mkyong.output.IOutputGenerator;

/**
 * Created by dc on 2015/7/14.
 *
 */
public class OutHelperSetterDI {
    IOutputGenerator outputGenerator;

    /**
     *   CONFIGURATION
     *   <bean id="OutputHelper" class="com.mkyong.output.OutputHelper">
         <property name="outputGenerator">
         <ref bean="CsvOutputGenerator" />
         </property>
         </bean>

         <bean id="CsvOutputGenerator" class="com.mkyong.output.impl.CsvOutputGenerator" />
         <bean id="JsonOutputGenerator" class="com.mkyong.output.impl.JsonOutputGenerator" />
     * @param outputGenerator
     */
    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
}
