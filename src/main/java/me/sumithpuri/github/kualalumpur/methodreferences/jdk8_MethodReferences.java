package me.sumithpuri.github.kualalumpur.methodreferences;

import java.util.Arrays;

import me.sumithpuri.github.kualalumpur.methodreferences.vo.jdk8_MethodReferencesVO;

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
public class jdk8_MethodReferences {
	
	public int compareByName(jdk8_MethodReferencesVO a, jdk8_MethodReferencesVO b) {
		
		return a.getName().compareTo(b.getName());
	}

	public int compareByAge(jdk8_MethodReferencesVO a, jdk8_MethodReferencesVO b) {
		
		return a.getAge().compareTo(b.getAge());
	}

	public static void main(String[] args) {

		demonstrate();
	}
	
	public static void demonstrate() {
		
		//Reference to a Static Method [ContainingClass::staticMethodName]
	    //Reference to an Instance Method [containingObject::instanceMethodName]
	    //Reference to a Constructor [ClassName::new]
	    //Reference to an Instance Method [ContainingType::methodName {Arbitary Object}]
		
		jdk8_MethodReferencesVO[] refs = new jdk8_MethodReferencesVO[5];
		
		jdk8_MethodReferencesVO vo1 = new jdk8_MethodReferencesVO();
		vo1.setAge(21);
		vo1.setName("Frank");
		refs[0] = vo1;
	
		vo1 = new jdk8_MethodReferencesVO();
		vo1.setAge(22);
		vo1.setName("Ibrahim");
		refs[1] = vo1;
		
		vo1 = new jdk8_MethodReferencesVO();
		vo1.setAge(24);
		vo1.setName("Vinod");
		refs[2] = vo1;
		
		vo1 = new jdk8_MethodReferencesVO();
		vo1.setAge(19);
		vo1.setName("Gurdeep");
		refs[3] = vo1;
		
		vo1 = new jdk8_MethodReferencesVO();
		vo1.setAge(25);
		vo1.setName("Maxovitch");
		refs[4] = vo1;
		
		jdk8_MethodReferences refC = new jdk8_MethodReferences();
		Arrays.sort(refs, refC::compareByAge);
		
		for (jdk8_MethodReferencesVO rvo : refs) {
			
			System.out.println(rvo.getAge() + ":" + rvo.getName());
		}
	}
}
