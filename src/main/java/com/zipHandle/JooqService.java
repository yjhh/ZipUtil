//package com.zipHandle;
//
//import com.zipHandle.dao.test.Tables;
//import org.jooq.DSLContext;
//import org.jooq.Record;
//import org.jooq.Result;
//import org.jooq.SelectJoinStep;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//import java.util.Iterator;
//
///**
// * create by Yao 2018/1/2 10:06
// **/
//@Service
//public class JooqService {
//
//    @Resource
//    private DSLContext context;
//
//    public void selectAll(){
////        List<Object> recodes = context.select().from(Tables.MSDS_DISPLAY_CATEGORY).getBindValues();
////        System.out.println(recodes);
////        SelectJoinStep<Record> step = context.select().from("msds_display_category");
//        SelectJoinStep<Record> step = context.select().from(Tables.MSDS_DISPLAY_CATEGORY);
//        Result<Record> result = step.fetch();
//
//        Iterator<Record> iter = result.iterator();
//
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
//    }
//
//}
