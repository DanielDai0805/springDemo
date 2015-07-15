package com.mkyong.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by dc on 2015/7/15.
 * Configuration
 *      <context:component-scan base-package="com.mkyong.customer" />
 */
@Service
@Scope("prototype")
public class AnnotationScope {

}
