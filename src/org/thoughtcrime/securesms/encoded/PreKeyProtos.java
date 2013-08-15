// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PreKeyEntity.proto

package org.thoughtcrime.securesms.encoded;

public final class PreKeyProtos {
  private PreKeyProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PreKeyEntityOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional uint64 id = 1;
    boolean hasId();
    long getId();
    
    // optional bytes key = 2;
    boolean hasKey();
    com.google.protobuf.ByteString getKey();
  }
  public static final class PreKeyEntity extends
      com.google.protobuf.GeneratedMessage
      implements PreKeyEntityOrBuilder {
    // Use PreKeyEntity.newBuilder() to construct.
    private PreKeyEntity(Builder builder) {
      super(builder);
    }
    private PreKeyEntity(boolean noInit) {}
    
    private static final PreKeyEntity defaultInstance;
    public static PreKeyEntity getDefaultInstance() {
      return defaultInstance;
    }
    
    public PreKeyEntity getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.thoughtcrime.securesms.encoded.PreKeyProtos.internal_static_textsecure_PreKeyEntity_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.thoughtcrime.securesms.encoded.PreKeyProtos.internal_static_textsecure_PreKeyEntity_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional uint64 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getId() {
      return id_;
    }
    
    // optional bytes key = 2;
    public static final int KEY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString key_;
    public boolean hasKey() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    
    private void initFields() {
      id_ = 0L;
      key_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, key_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, key_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.thoughtcrime.securesms.encoded.PreKeyProtos.internal_static_textsecure_PreKeyEntity_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.thoughtcrime.securesms.encoded.PreKeyProtos.internal_static_textsecure_PreKeyEntity_fieldAccessorTable;
      }
      
      // Construct using org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        id_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity.getDescriptor();
      }
      
      public org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity getDefaultInstanceForType() {
        return org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity.getDefaultInstance();
      }
      
      public org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity build() {
        org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity buildPartial() {
        org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity result = new org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.key_ = key_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity) {
          return mergeFrom((org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity other) {
        if (other == org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readUInt64();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              key_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional uint64 id = 1;
      private long id_ ;
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getId() {
        return id_;
      }
      public Builder setId(long value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0L;
        onChanged();
        return this;
      }
      
      // optional bytes key = 2;
      private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
      public boolean hasKey() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public com.google.protobuf.ByteString getKey() {
        return key_;
      }
      public Builder setKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        key_ = value;
        onChanged();
        return this;
      }
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:textsecure.PreKeyEntity)
    }
    
    static {
      defaultInstance = new PreKeyEntity(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:textsecure.PreKeyEntity)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_textsecure_PreKeyEntity_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_textsecure_PreKeyEntity_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022PreKeyEntity.proto\022\ntextsecure\"\'\n\014PreK" +
      "eyEntity\022\n\n\002id\030\001 \001(\004\022\013\n\003key\030\002 \001(\014B2\n\"org" +
      ".thoughtcrime.securesms.encodedB\014PreKeyP" +
      "rotos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_textsecure_PreKeyEntity_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_textsecure_PreKeyEntity_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_textsecure_PreKeyEntity_descriptor,
              new java.lang.String[] { "Id", "Key", },
              org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity.class,
              org.thoughtcrime.securesms.encoded.PreKeyProtos.PreKeyEntity.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}