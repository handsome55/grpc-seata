// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StorageService.proto

package com.middol.grpc;

public final class StorageProto {
  private StorageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_middol_grpc_StorageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_middol_grpc_StorageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_middol_grpc_StorageReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_middol_grpc_StorageReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024StorageService.proto\022\017com.middol.grpc\"" +
      "B\n\016StorageRequest\022\n\n\002id\030\001 \001(\005\022\025\n\rcommodi" +
      "tyCode\030\002 \001(\t\022\r\n\005count\030\003 \001(\005\"\037\n\014StorageRe" +
      "ply\022\017\n\007message\030\001 \001(\t2\315\002\n\016StorageService\022" +
      "J\n\006deduct\022\037.com.middol.grpc.StorageReque" +
      "st\032\035.com.middol.grpc.StorageReply\"\000\022I\n\003g" +
      "et\022\037.com.middol.grpc.StorageRequest\032\037.co" +
      "m.middol.grpc.StorageRequest\"\000\022Q\n\013batchU" +
      "pdate\022\037.com.middol.grpc.StorageRequest\032\037" +
      ".com.middol.grpc.StorageRequest\"\000\022Q\n\013bat" +
      "chDelete\022\037.com.middol.grpc.StorageReques" +
      "t\032\037.com.middol.grpc.StorageRequest\"\000B!\n\017" +
      "com.middol.grpcB\014StorageProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_middol_grpc_StorageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_middol_grpc_StorageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_middol_grpc_StorageRequest_descriptor,
        new java.lang.String[] { "Id", "CommodityCode", "Count", });
    internal_static_com_middol_grpc_StorageReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_middol_grpc_StorageReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_middol_grpc_StorageReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
