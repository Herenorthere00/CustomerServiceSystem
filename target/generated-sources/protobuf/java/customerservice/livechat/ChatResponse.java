// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LiveChat.proto

// Protobuf Java Version: 3.25.0
package customerservice.livechat;

/**
 * <pre>
 * an Agent can respond to the customer
 * </pre>
 *
 * Protobuf type {@code customerservice.livechat.ChatResponse}
 */
public final class ChatResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:customerservice.livechat.ChatResponse)
    ChatResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChatResponse.newBuilder() to construct.
  private ChatResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChatResponse() {
    agentId_ = "";
    response_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChatResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return customerservice.livechat.LiveChatProto.internal_static_customerservice_livechat_ChatResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return customerservice.livechat.LiveChatProto.internal_static_customerservice_livechat_ChatResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            customerservice.livechat.ChatResponse.class, customerservice.livechat.ChatResponse.Builder.class);
  }

  public static final int AGENTID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object agentId_ = "";
  /**
   * <code>string agentId = 1;</code>
   * @return The agentId.
   */
  @java.lang.Override
  public java.lang.String getAgentId() {
    java.lang.Object ref = agentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentId_ = s;
      return s;
    }
  }
  /**
   * <code>string agentId = 1;</code>
   * @return The bytes for agentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAgentIdBytes() {
    java.lang.Object ref = agentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object response_ = "";
  /**
   * <code>string response = 2;</code>
   * @return The response.
   */
  @java.lang.Override
  public java.lang.String getResponse() {
    java.lang.Object ref = response_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      response_ = s;
      return s;
    }
  }
  /**
   * <code>string response = 2;</code>
   * @return The bytes for response.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResponseBytes() {
    java.lang.Object ref = response_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      response_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, agentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(response_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, response_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(agentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, agentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(response_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, response_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof customerservice.livechat.ChatResponse)) {
      return super.equals(obj);
    }
    customerservice.livechat.ChatResponse other = (customerservice.livechat.ChatResponse) obj;

    if (!getAgentId()
        .equals(other.getAgentId())) return false;
    if (!getResponse()
        .equals(other.getResponse())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AGENTID_FIELD_NUMBER;
    hash = (53 * hash) + getAgentId().hashCode();
    hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
    hash = (53 * hash) + getResponse().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static customerservice.livechat.ChatResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static customerservice.livechat.ChatResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static customerservice.livechat.ChatResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static customerservice.livechat.ChatResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static customerservice.livechat.ChatResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static customerservice.livechat.ChatResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static customerservice.livechat.ChatResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static customerservice.livechat.ChatResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static customerservice.livechat.ChatResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static customerservice.livechat.ChatResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static customerservice.livechat.ChatResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static customerservice.livechat.ChatResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(customerservice.livechat.ChatResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * an Agent can respond to the customer
   * </pre>
   *
   * Protobuf type {@code customerservice.livechat.ChatResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:customerservice.livechat.ChatResponse)
      customerservice.livechat.ChatResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return customerservice.livechat.LiveChatProto.internal_static_customerservice_livechat_ChatResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return customerservice.livechat.LiveChatProto.internal_static_customerservice_livechat_ChatResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              customerservice.livechat.ChatResponse.class, customerservice.livechat.ChatResponse.Builder.class);
    }

    // Construct using customerservice.livechat.ChatResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      agentId_ = "";
      response_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return customerservice.livechat.LiveChatProto.internal_static_customerservice_livechat_ChatResponse_descriptor;
    }

    @java.lang.Override
    public customerservice.livechat.ChatResponse getDefaultInstanceForType() {
      return customerservice.livechat.ChatResponse.getDefaultInstance();
    }

    @java.lang.Override
    public customerservice.livechat.ChatResponse build() {
      customerservice.livechat.ChatResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public customerservice.livechat.ChatResponse buildPartial() {
      customerservice.livechat.ChatResponse result = new customerservice.livechat.ChatResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(customerservice.livechat.ChatResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.agentId_ = agentId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.response_ = response_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof customerservice.livechat.ChatResponse) {
        return mergeFrom((customerservice.livechat.ChatResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(customerservice.livechat.ChatResponse other) {
      if (other == customerservice.livechat.ChatResponse.getDefaultInstance()) return this;
      if (!other.getAgentId().isEmpty()) {
        agentId_ = other.agentId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getResponse().isEmpty()) {
        response_ = other.response_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              agentId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              response_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object agentId_ = "";
    /**
     * <code>string agentId = 1;</code>
     * @return The agentId.
     */
    public java.lang.String getAgentId() {
      java.lang.Object ref = agentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string agentId = 1;</code>
     * @return The bytes for agentId.
     */
    public com.google.protobuf.ByteString
        getAgentIdBytes() {
      java.lang.Object ref = agentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string agentId = 1;</code>
     * @param value The agentId to set.
     * @return This builder for chaining.
     */
    public Builder setAgentId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      agentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string agentId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAgentId() {
      agentId_ = getDefaultInstance().getAgentId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string agentId = 1;</code>
     * @param value The bytes for agentId to set.
     * @return This builder for chaining.
     */
    public Builder setAgentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      agentId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object response_ = "";
    /**
     * <code>string response = 2;</code>
     * @return The response.
     */
    public java.lang.String getResponse() {
      java.lang.Object ref = response_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        response_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string response = 2;</code>
     * @return The bytes for response.
     */
    public com.google.protobuf.ByteString
        getResponseBytes() {
      java.lang.Object ref = response_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        response_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string response = 2;</code>
     * @param value The response to set.
     * @return This builder for chaining.
     */
    public Builder setResponse(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      response_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string response = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResponse() {
      response_ = getDefaultInstance().getResponse();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string response = 2;</code>
     * @param value The bytes for response to set.
     * @return This builder for chaining.
     */
    public Builder setResponseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      response_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:customerservice.livechat.ChatResponse)
  }

  // @@protoc_insertion_point(class_scope:customerservice.livechat.ChatResponse)
  private static final customerservice.livechat.ChatResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new customerservice.livechat.ChatResponse();
  }

  public static customerservice.livechat.ChatResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChatResponse>
      PARSER = new com.google.protobuf.AbstractParser<ChatResponse>() {
    @java.lang.Override
    public ChatResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ChatResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChatResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public customerservice.livechat.ChatResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

