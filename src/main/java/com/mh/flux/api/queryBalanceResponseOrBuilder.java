// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

package com.mh.flux.api;

public interface queryBalanceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:queryBalanceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .respHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>optional .respHeader header = 1;</code>
   */
  com.mh.flux.api.response.respHeader getHeader();
  /**
   * <code>optional .respHeader header = 1;</code>
   */
  com.mh.flux.api.response.respHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>optional .queryBalanceResponse.payloadBody payload = 2;</code>
   */
  boolean hasPayload();
  /**
   * <code>optional .queryBalanceResponse.payloadBody payload = 2;</code>
   */
  com.mh.flux.api.queryBalanceResponse.payloadBody getPayload();
  /**
   * <code>optional .queryBalanceResponse.payloadBody payload = 2;</code>
   */
  com.mh.flux.api.queryBalanceResponse.payloadBodyOrBuilder getPayloadOrBuilder();
}
