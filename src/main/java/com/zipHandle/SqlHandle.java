//package com.zipHandle;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * create by Yao 2018/1/11 20:56
// **/
//public class SqlHandle {
//
//    public static void main(String[] args) throws IOException {
//        //权限编码
//        InputStream stream = SqlHandle.class.getClassLoader().getResourceAsStream("222");
////        InputStream stream = SqlHandle.class.getResourceAsStream("153");
//        //角色编码
//        InputStream stream2 = SqlHandle.class.getClassLoader().getResourceAsStream("111");
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
//        BufferedReader reader2 = new BufferedReader(new InputStreamReader(stream2));
//
//        String line = null;
//        String line2 = null;
//        List<Long> pressIds = new ArrayList<>();
//        List<Long> groupIds = new ArrayList<>();
//        while((line = reader.readLine()) != null){
//            pressIds.add(Long.parseLong(line.trim()));
//        }
//        while((line2 = reader2.readLine()) != null){
//            groupIds.add(Long.parseLong(line2.trim()));
//        }
//
//        for(Long groupId:groupIds){
//            for(Long pressId:pressIds){
//                System.out.println("insert into auth_group_permissions_cs (group_id, permission_id) VALUES ("+groupId+","+pressId+");");
//            }
//        }
//    }
//}
