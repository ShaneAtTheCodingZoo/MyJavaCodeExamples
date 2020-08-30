package com.thecodingzoo.lessons.advanced;

import java.util.List;

@FunctionalInterface
public interface StudentSearch   {
	boolean search(List<String> students, String name);
}
