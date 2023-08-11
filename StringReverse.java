package com.demo;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {
	public static void main(String[] args) {
		String str = "My name is Harshal";
		
		String str2 = Stream.of(str)
        .map(word->new StringBuilder(word).reverse())
        .collect(Collectors.joining());
		
		System.out.println(str2);
	}

}
