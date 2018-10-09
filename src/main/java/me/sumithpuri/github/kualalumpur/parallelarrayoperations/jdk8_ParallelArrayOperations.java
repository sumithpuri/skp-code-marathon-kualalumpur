package me.sumithpuri.github.kualalumpur.parallelarrayoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;  

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
public class jdk8_ParallelArrayOperations {
	
	static List<Project> projects = new ArrayList<Project>();

	public static void main(String[] args) {
		
		demonstrate();
	}
	
	public static void demonstrate() {
		
		Project project = new Project();
		project.setName("development");
		projects.add(project);
		project = new Project();
		project.setName("testing");
		projects.add(project);
		project = new Project();
		project.setName("build");
		projects.add(project);
		
		//inherently better throughput and elegant syntax
		projects.stream().parallel().forEach(a -> action(a));
	
		for (Project p : projects) {
			System.out.println(p.getName() + ":" + p.getManager());
		}
		
	}

	public static void action(Project x) {
		
		int pmR = new Random().nextInt(1000);
		x.setManager("john" + pmR);
	}
}

class Project {
	
	String name;
	String manager;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
}