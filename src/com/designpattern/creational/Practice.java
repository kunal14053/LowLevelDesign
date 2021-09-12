package com.designpattern.creational;

import com.designpattern.creational.builder.ObjectBuild;

public class Practice {

    public static void main(String[] args) {
        ObjectBuild objectBuild = ObjectBuild.build()
                .withFirstName("Kunal")
                .withLastName("Saini")
                .withAddress("197 Raja Garden");

        System.out.println(objectBuild.getFirst_name());
        System.out.println(objectBuild.getLast_name());
        System.out.println(objectBuild.getAddress());
    }

}
