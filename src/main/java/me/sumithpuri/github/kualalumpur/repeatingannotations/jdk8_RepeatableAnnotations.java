package me.sumithpuri.github.kualalumpur.repeatingannotations;

import me.sumithpuri.github.kualalumpur.repeatingannotations.source.jdk8_RepeatableAnnotationsSource;
import me.sumithpuri.github.kualalumpur.repeatingannotations.source.jdk8_RepeatableAnnotationsSources;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2015/05/java-se-8-whats-new-part-0404.html	
 * Blog Short URL		https://goo.gl/8YBWTk
 * Package Prefix 		me.sumithpuri.github.kualalumpur
 * Project Codename		kualalumpur
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sublicense,and/or sell copies of the Software, and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
@jdk8_RepeatableAnnotationsSource(version = "jdk5")
@jdk8_RepeatableAnnotationsSource(version = "jdk6")
@jdk8_RepeatableAnnotationsSource(version = "jdk7")
public class jdk8_RepeatableAnnotations {
	
	public static void main(String[] args) {
		
		demonstrate();
	}
	
	public static void demonstrate() {
		
		Class<jdk8_RepeatableAnnotations> clazz = jdk8_RepeatableAnnotations.class;
		
		//one way is to get all the values as the container annotation with value array
		jdk8_RepeatableAnnotationsSources sources1 = clazz.getAnnotation(jdk8_RepeatableAnnotationsSources.class);
		
		System.out.println("Retrieval/Parsing of the Container Annotation \n"
				         + "(Containing Repeatable Annotation Array) >>");
		for (jdk8_RepeatableAnnotationsSource source : sources1.value()) {
		
			System.out.println(source.version());
		}
		
		//one way is to get all the values as the repeatable annotations
		jdk8_RepeatableAnnotationsSource[] sources2 = clazz.getAnnotationsByType(jdk8_RepeatableAnnotationsSource.class);
		System.out.println();		
		System.out.println("Retrieval/Parsing of the Container Annotation >>");
		for (jdk8_RepeatableAnnotationsSource source : sources2) {
			
			System.out.println(source.version());
		}
	}
}