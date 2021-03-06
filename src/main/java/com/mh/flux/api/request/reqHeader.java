// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commonRequestHeader.proto

package com.mh.flux.api.request;

/**
 * Protobuf type {@code reqHeader}
 */
public  final class reqHeader extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:reqHeader)
    reqHeaderOrBuilder {
  // Use reqHeader.newBuilder() to construct.
  private reqHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private reqHeader() {
    timestamp_ = "";
    identity_ = "";
    type_ = 0;
    sign_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private reqHeader(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            timestamp_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            identity_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            sign_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mh.flux.api.request.FluxAPIProto.internal_static_reqHeader_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mh.flux.api.request.FluxAPIProto.internal_static_reqHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mh.flux.api.request.reqHeader.class, com.mh.flux.api.request.reqHeader.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private volatile java.lang.Object timestamp_;
  /**
   * <code>optional string timestamp = 1;</code>
   */
  public java.lang.String getTimestamp() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timestamp_ = s;
      return s;
    }
  }
  /**
   * <code>optional string timestamp = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTimestampBytes() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timestamp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDENTITY_FIELD_NUMBER = 2;
  private volatile java.lang.Object identity_;
  /**
   * <code>optional string identity = 2;</code>
   */
  public java.lang.String getIdentity() {
    java.lang.Object ref = identity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identity_ = s;
      return s;
    }
  }
  /**
   * <code>optional string identity = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIdentityBytes() {
    java.lang.Object ref = identity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      identity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <code>optional .messageType type = 3;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>optional .messageType type = 3;</code>
   */
  public com.mh.flux.api.request.messageType getType() {
    com.mh.flux.api.request.messageType result = com.mh.flux.api.request.messageType.valueOf(type_);
    return result == null ? com.mh.flux.api.request.messageType.UNRECOGNIZED : result;
  }

  public static final int SIGN_FIELD_NUMBER = 4;
  private volatile java.lang.Object sign_;
  /**
   * <code>optional string sign = 4;</code>
   */
  public java.lang.String getSign() {
    java.lang.Object ref = sign_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sign_ = s;
      return s;
    }
  }
  /**
   * <code>optional string sign = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSignBytes() {
    java.lang.Object ref = sign_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sign_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTimestampBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, timestamp_);
    }
    if (!getIdentityBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identity_);
    }
    if (type_ != com.mh.flux.api.request.messageType.JSON.getNumber()) {
      output.writeEnum(3, type_);
    }
    if (!getSignBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sign_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTimestampBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, timestamp_);
    }
    if (!getIdentityBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identity_);
    }
    if (type_ != com.mh.flux.api.request.messageType.JSON.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
    }
    if (!getSignBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sign_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.mh.flux.api.request.reqHeader)) {
      return super.equals(obj);
    }
    com.mh.flux.api.request.reqHeader other = (com.mh.flux.api.request.reqHeader) obj;

    boolean result = true;
    result = result && getTimestamp()
        .equals(other.getTimestamp());
    result = result && getIdentity()
        .equals(other.getIdentity());
    result = result && type_ == other.type_;
    result = result && getSign()
        .equals(other.getSign());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp().hashCode();
    hash = (37 * hash) + IDENTITY_FIELD_NUMBER;
    hash = (53 * hash) + getIdentity().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + SIGN_FIELD_NUMBER;
    hash = (53 * hash) + getSign().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mh.flux.api.request.reqHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mh.flux.api.request.reqHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mh.flux.api.request.reqHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mh.flux.api.request.reqHeader parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mh.flux.api.request.reqHeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mh.flux.api.request.reqHeader parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mh.flux.api.request.reqHeader parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mh.flux.api.request.reqHeader parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mh.flux.api.request.reqHeader parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mh.flux.api.request.reqHeader parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.mh.flux.api.request.reqHeader prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code reqHeader}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:reqHeader)
      com.mh.flux.api.request.reqHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mh.flux.api.request.FluxAPIProto.internal_static_reqHeader_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mh.flux.api.request.FluxAPIProto.internal_static_reqHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mh.flux.api.request.reqHeader.class, com.mh.flux.api.request.reqHeader.Builder.class);
    }

    // Construct using com.mh.flux.api.request.reqHeader.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      timestamp_ = "";

      identity_ = "";

      type_ = 0;

      sign_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mh.flux.api.request.FluxAPIProto.internal_static_reqHeader_descriptor;
    }

    public com.mh.flux.api.request.reqHeader getDefaultInstanceForType() {
      return com.mh.flux.api.request.reqHeader.getDefaultInstance();
    }

    public com.mh.flux.api.request.reqHeader build() {
      com.mh.flux.api.request.reqHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.mh.flux.api.request.reqHeader buildPartial() {
      com.mh.flux.api.request.reqHeader result = new com.mh.flux.api.request.reqHeader(this);
      result.timestamp_ = timestamp_;
      result.identity_ = identity_;
      result.type_ = type_;
      result.sign_ = sign_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mh.flux.api.request.reqHeader) {
        return mergeFrom((com.mh.flux.api.request.reqHeader)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mh.flux.api.request.reqHeader other) {
      if (other == com.mh.flux.api.request.reqHeader.getDefaultInstance()) return this;
      if (!other.getTimestamp().isEmpty()) {
        timestamp_ = other.timestamp_;
        onChanged();
      }
      if (!other.getIdentity().isEmpty()) {
        identity_ = other.identity_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getSign().isEmpty()) {
        sign_ = other.sign_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.mh.flux.api.request.reqHeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mh.flux.api.request.reqHeader) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object timestamp_ = "";
    /**
     * <code>optional string timestamp = 1;</code>
     */
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string timestamp = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string timestamp = 1;</code>
     */
    public Builder setTimestamp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string timestamp = 1;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = getDefaultInstance().getTimestamp();
      onChanged();
      return this;
    }
    /**
     * <code>optional string timestamp = 1;</code>
     */
    public Builder setTimestampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      timestamp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object identity_ = "";
    /**
     * <code>optional string identity = 2;</code>
     */
    public java.lang.String getIdentity() {
      java.lang.Object ref = identity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string identity = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdentityBytes() {
      java.lang.Object ref = identity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string identity = 2;</code>
     */
    public Builder setIdentity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      identity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string identity = 2;</code>
     */
    public Builder clearIdentity() {
      
      identity_ = getDefaultInstance().getIdentity();
      onChanged();
      return this;
    }
    /**
     * <code>optional string identity = 2;</code>
     */
    public Builder setIdentityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      identity_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>optional .messageType type = 3;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>optional .messageType type = 3;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .messageType type = 3;</code>
     */
    public com.mh.flux.api.request.messageType getType() {
      com.mh.flux.api.request.messageType result = com.mh.flux.api.request.messageType.valueOf(type_);
      return result == null ? com.mh.flux.api.request.messageType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .messageType type = 3;</code>
     */
    public Builder setType(com.mh.flux.api.request.messageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .messageType type = 3;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sign_ = "";
    /**
     * <code>optional string sign = 4;</code>
     */
    public java.lang.String getSign() {
      java.lang.Object ref = sign_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sign_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string sign = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSignBytes() {
      java.lang.Object ref = sign_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sign_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string sign = 4;</code>
     */
    public Builder setSign(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sign_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string sign = 4;</code>
     */
    public Builder clearSign() {
      
      sign_ = getDefaultInstance().getSign();
      onChanged();
      return this;
    }
    /**
     * <code>optional string sign = 4;</code>
     */
    public Builder setSignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sign_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:reqHeader)
  }

  // @@protoc_insertion_point(class_scope:reqHeader)
  private static final com.mh.flux.api.request.reqHeader DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mh.flux.api.request.reqHeader();
  }

  public static com.mh.flux.api.request.reqHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<reqHeader>
      PARSER = new com.google.protobuf.AbstractParser<reqHeader>() {
    public reqHeader parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new reqHeader(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<reqHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<reqHeader> getParserForType() {
    return PARSER;
  }

  public com.mh.flux.api.request.reqHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

