package me.sumithpuri.github.kualalumpur.methodparameterreflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

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
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
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
 * go to the root path of your source code folders, then type the following to demonstrate / understand this
 * 
 * javac -source 1.8 -target 1.8 -cp . -parameters  
 * me\sumithpuri\github\kualalumpur\methodparameterreflection\jdk8_MethodParameterReflection.java
 * 
 * java -cp . 
 * me.sumithpuri.github.kualalumpur.methodparameterreflection.jdk8_MethodParameterReflection
 * 
 *  
 */
public class jdk8_MethodParameterReflection {
	
	public static void main(String[] args) {
	
		demonstrate();
	}
	
	public static void demonstrate() {
		
		Class<BlackHat> clazz = BlackHat.class;
		
		for (Method m : clazz.getDeclaredMethods()) {
			
			for (Parameter p : m.getParameters()) {
				System.out.println(p.getName());
			}
		}
	}
}

class BlackHat {
	
	public void payload(String hostName, int hostPort, boolean howdy) {
		System.out.println("i can do something");
	}
}
