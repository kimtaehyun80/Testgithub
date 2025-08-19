package org.example.Head04_JCF.example06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kim", "Lee", "Park", "Kang", "Choi", "Cha");

        // 이름의 첫 글자를 기준으로 그룹화
        Map<Character, List<String>> grouped = names.stream()
                //캐릭터 타입키와 문자열 리스트값을 갖는 맵타입 grouped변수에
                // names변수값을 스트림한것을  할당해라
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        //문자열 리스트 첫글라를 기준으로 그룹화 해라

        System.out.println(grouped);
    }
}

