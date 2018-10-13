package me.sumithpuri.github.kualalumpur.main;

import me.sumithpuri.github.kualalumpur.lambdaexpressions.jdk8_LambdaExpressions;
import me.sumithpuri.github.kualalumpur.methodparameterreflection.jdk8_MethodParameterReflection;
import me.sumithpuri.github.kualalumpur.methodreferences.jdk8_MethodReferences;
import me.sumithpuri.github.kualalumpur.parallelarrayoperations.jdk8_ParallelArrayOperations;
import me.sumithpuri.github.kualalumpur.repeatingannotations.jdk8_RepeatableAnnotations;

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

/* 
 * You may run this main class to run all the Demo Code of the [KualaLumpur] Project. It demonstrates the most important 
 * changes in Java 8.
 */
public class jdk8_KualaLumpur {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      KualaLumpur");
		System.out.println("Project Description   Java 8 Companion Code Samples");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println("Technical Blog Post   https://goo.gl/8YBWTk");
		System.out.println("[Developer Notes]     [01] Use Java Version 9.0+ Compiler");
		
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("[01. Lambda Expressions]");
		lambdaExpressions();
		System.out.println("------------------------------------------------------------");
		System.out.println("[02. Parallel Array Operations]");
		parallelArrayOperations();
		System.out.println("------------------------------------------------------------");
		System.out.println("[03. Repeating Annotations]");
		repeatingAnnotations();
		System.out.println("------------------------------------------------------------");
		System.out.println("[04. Method References]");
		methodReferences();
		System.out.println("------------------------------------------------------------");
		System.out.println("[05. Method Parameter Reflection]");
		methodParameterReflection();
		System.out.println("------------------------------------------------------------");
	}
	
	
	private static void lambdaExpressions() {
		
		jdk8_LambdaExpressions lambdaExpressions = new jdk8_LambdaExpressions();
		lambdaExpressions.demonstrate();
	}
	
	private static void parallelArrayOperations() {
		
		jdk8_ParallelArrayOperations parallelArrayOperations = new jdk8_ParallelArrayOperations();
		parallelArrayOperations.demonstrate();
	}
	
	private static void repeatingAnnotations() {
		
		jdk8_RepeatableAnnotations repeatingAnnotations = new jdk8_RepeatableAnnotations();
		repeatingAnnotations.demonstrate();
	}
	
	private static void methodReferences() {
		
		jdk8_MethodReferences methodReferences = new jdk8_MethodReferences();
		methodReferences.demonstrate();
	}
	
	private static void methodParameterReflection() {
		
		System.out.println("Below Output is not the Right Output to Demonstrate the Code Samples. Dummy Output Only.");
		
		jdk8_MethodParameterReflection methodParameterReflection = new jdk8_MethodParameterReflection();
		methodParameterReflection.demonstrate();
		
	    System.out.println("\n#Go To the Root Path of Your Source Code Folders, then Type the Following..."); 
	    System.out.println("javac -source 1.8 -target 1.8 -cp . -parameters" +  
	    					" me\\sumithpuri\\github\\kualalumpur\\methodparameterreflection\\jdk8_MethodParameterReflection.java");
	    System.out.println("\n#After the Compilation, Run the Demonstration / Sample using Following...");
	    System.out.println("java -cp . me.sumithpuri.github.kualalumpur.methodparameterreflection.jdk8_MethodParameterReflection"); 

	}
}
