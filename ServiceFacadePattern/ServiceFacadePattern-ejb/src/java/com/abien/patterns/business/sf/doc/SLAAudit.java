/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abien.patterns.business.sf.doc;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.interceptor.InterceptorBinding;

/**
 *
 * @author adam bien, adam-bien.com
 */
@Inherited
@InterceptorBinding
@Retention(RUNTIME)
@Target(TYPE)
public @interface SLAAudit {
}
