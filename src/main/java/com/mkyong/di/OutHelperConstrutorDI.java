package com.mkyong.di;

import com.mkyong.output.IOutputGenerator;

/**
 * Created by dc on 2015/7/14.
 */
public class OutHelperConstrutorDI {
    IOutputGenerator outputGenerator;

    /**
     *
     * Configuration
     *
     *   <bean id="OutputHelper" class="com.mkyong.output.OutputHelper">
         <constructor-arg>
         <bean class="com.mkyong.output.impl.CsvOutputGenerator" />
         </constructor-arg>
         </bean>

         <bean id="CsvOutputGenerator" class="com.mkyong.output.impl.CsvOutputGenerator" />
         <bean id="JsonOutputGenerator" class="com.mkyong.output.impl.JsonOutputGenerator" />
     */
    OutHelperConstrutorDI(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
