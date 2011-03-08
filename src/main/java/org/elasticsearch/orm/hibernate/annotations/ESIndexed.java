package org.elasticsearch.orm.hibernate.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.TYPE )
@Documented
/**
 * Indicate that the entity will be indexed by Elastic Search
 * @author David Pilato
 */
public @interface ESIndexed {
	/**
	 * @return the index Name used by Elastic (Default : "default")
	 */
	String indexName() default "default";
}
