//package com.zipHandle;
//
//import org.elasticsearch.action.get.GetRequest;
//import org.elasticsearch.action.get.GetResponse;
//import org.elasticsearch.action.search.SearchRequest;
//import org.elasticsearch.action.search.SearchResponse;
//import org.elasticsearch.client.Client;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.TransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.springframework.stereotype.Service;
//
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//import java.util.concurrent.ExecutionException;
//
///**
// * create by Yao 2018/1/8 15:38
// **/
//@Service
//public class SearchService {
//
//    public static void main(String[] args) throws ExecutionException, InterruptedException, UnknownHostException {
//        Client client = new PreBuiltTransportClient(Settings.EMPTY)
//                        .addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"),9300));
////        GetRequest request = new GetRequest();
////        GetResponse res = client.get(request).get();
////        request.id();
////        request.index()
//        SearchRequest req = new SearchRequest();
//        SearchResponse res = client.search(req).get();
//
//        System.out.println(res);
//    }
//}
