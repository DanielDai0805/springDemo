package com.mkyong.output.helper;

import com.mkyong.output.IOutputGenerator;
import com.mkyong.output.impl.CvsOutputGeneratorImpl;

/**
 * Created by dc on 2015/7/14.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;

    public OutputHelper() {
        //this.outputGenerator = new CvsOutputGeneratorImpl();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    public void generateOutput(){
        outputGenerator.generatoeOutput();
    }
}
