// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProductService.proto

package dev.dberenguer.grpccloudevents.grpc;

public interface ProductDtoGrpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dev.dberenguer.grpccloudevents.grpc.ProductDtoGrpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string code = 1;</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <code>string code = 1;</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>double price = 3;</code>
   * @return The price.
   */
  double getPrice();
}
