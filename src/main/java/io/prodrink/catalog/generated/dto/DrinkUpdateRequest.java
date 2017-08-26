// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog/dto.proto

package io.prodrink.catalog.generated.dto;

/**
 * Protobuf type {@code catalog.DrinkUpdateRequest}
 */
public  final class DrinkUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:catalog.DrinkUpdateRequest)
    DrinkUpdateRequestOrBuilder {
  // Use DrinkUpdateRequest.newBuilder() to construct.
  private DrinkUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DrinkUpdateRequest() {
    drinkId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DrinkUpdateRequest(
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
          case 8: {

            drinkId_ = input.readInt32();
            break;
          }
          case 18: {
            io.prodrink.catalog.generated.domain.Drink.Builder subBuilder = null;
            if (drink_ != null) {
              subBuilder = drink_.toBuilder();
            }
            drink_ = input.readMessage(io.prodrink.catalog.generated.domain.Drink.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(drink_);
              drink_ = subBuilder.buildPartial();
            }

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
    return io.prodrink.catalog.generated.dto.DrinkDtoOuter.internal_static_catalog_DrinkUpdateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.prodrink.catalog.generated.dto.DrinkDtoOuter.internal_static_catalog_DrinkUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.prodrink.catalog.generated.dto.DrinkUpdateRequest.class, io.prodrink.catalog.generated.dto.DrinkUpdateRequest.Builder.class);
  }

  public static final int DRINK_ID_FIELD_NUMBER = 1;
  private int drinkId_;
  /**
   * <code>int32 drink_id = 1;</code>
   */
  public int getDrinkId() {
    return drinkId_;
  }

  public static final int DRINK_FIELD_NUMBER = 2;
  private io.prodrink.catalog.generated.domain.Drink drink_;
  /**
   * <code>.catalog.Drink drink = 2;</code>
   */
  public boolean hasDrink() {
    return drink_ != null;
  }
  /**
   * <code>.catalog.Drink drink = 2;</code>
   */
  public io.prodrink.catalog.generated.domain.Drink getDrink() {
    return drink_ == null ? io.prodrink.catalog.generated.domain.Drink.getDefaultInstance() : drink_;
  }
  /**
   * <code>.catalog.Drink drink = 2;</code>
   */
  public io.prodrink.catalog.generated.domain.DrinkOrBuilder getDrinkOrBuilder() {
    return getDrink();
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
    if (drinkId_ != 0) {
      output.writeInt32(1, drinkId_);
    }
    if (drink_ != null) {
      output.writeMessage(2, getDrink());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (drinkId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, drinkId_);
    }
    if (drink_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDrink());
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
    if (!(obj instanceof io.prodrink.catalog.generated.dto.DrinkUpdateRequest)) {
      return super.equals(obj);
    }
    io.prodrink.catalog.generated.dto.DrinkUpdateRequest other = (io.prodrink.catalog.generated.dto.DrinkUpdateRequest) obj;

    boolean result = true;
    result = result && (getDrinkId()
        == other.getDrinkId());
    result = result && (hasDrink() == other.hasDrink());
    if (hasDrink()) {
      result = result && getDrink()
          .equals(other.getDrink());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DRINK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDrinkId();
    if (hasDrink()) {
      hash = (37 * hash) + DRINK_FIELD_NUMBER;
      hash = (53 * hash) + getDrink().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest parseFrom(
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
  public static Builder newBuilder(io.prodrink.catalog.generated.dto.DrinkUpdateRequest prototype) {
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
   * Protobuf type {@code catalog.DrinkUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:catalog.DrinkUpdateRequest)
      io.prodrink.catalog.generated.dto.DrinkUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.prodrink.catalog.generated.dto.DrinkDtoOuter.internal_static_catalog_DrinkUpdateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.prodrink.catalog.generated.dto.DrinkDtoOuter.internal_static_catalog_DrinkUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.prodrink.catalog.generated.dto.DrinkUpdateRequest.class, io.prodrink.catalog.generated.dto.DrinkUpdateRequest.Builder.class);
    }

    // Construct using io.prodrink.catalog.generated.dto.DrinkUpdateRequest.newBuilder()
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
      drinkId_ = 0;

      if (drinkBuilder_ == null) {
        drink_ = null;
      } else {
        drink_ = null;
        drinkBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.prodrink.catalog.generated.dto.DrinkDtoOuter.internal_static_catalog_DrinkUpdateRequest_descriptor;
    }

    public io.prodrink.catalog.generated.dto.DrinkUpdateRequest getDefaultInstanceForType() {
      return io.prodrink.catalog.generated.dto.DrinkUpdateRequest.getDefaultInstance();
    }

    public io.prodrink.catalog.generated.dto.DrinkUpdateRequest build() {
      io.prodrink.catalog.generated.dto.DrinkUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.prodrink.catalog.generated.dto.DrinkUpdateRequest buildPartial() {
      io.prodrink.catalog.generated.dto.DrinkUpdateRequest result = new io.prodrink.catalog.generated.dto.DrinkUpdateRequest(this);
      result.drinkId_ = drinkId_;
      if (drinkBuilder_ == null) {
        result.drink_ = drink_;
      } else {
        result.drink_ = drinkBuilder_.build();
      }
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
      if (other instanceof io.prodrink.catalog.generated.dto.DrinkUpdateRequest) {
        return mergeFrom((io.prodrink.catalog.generated.dto.DrinkUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.prodrink.catalog.generated.dto.DrinkUpdateRequest other) {
      if (other == io.prodrink.catalog.generated.dto.DrinkUpdateRequest.getDefaultInstance()) return this;
      if (other.getDrinkId() != 0) {
        setDrinkId(other.getDrinkId());
      }
      if (other.hasDrink()) {
        mergeDrink(other.getDrink());
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
      io.prodrink.catalog.generated.dto.DrinkUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.prodrink.catalog.generated.dto.DrinkUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int drinkId_ ;
    /**
     * <code>int32 drink_id = 1;</code>
     */
    public int getDrinkId() {
      return drinkId_;
    }
    /**
     * <code>int32 drink_id = 1;</code>
     */
    public Builder setDrinkId(int value) {
      
      drinkId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 drink_id = 1;</code>
     */
    public Builder clearDrinkId() {
      
      drinkId_ = 0;
      onChanged();
      return this;
    }

    private io.prodrink.catalog.generated.domain.Drink drink_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.prodrink.catalog.generated.domain.Drink, io.prodrink.catalog.generated.domain.Drink.Builder, io.prodrink.catalog.generated.domain.DrinkOrBuilder> drinkBuilder_;
    /**
     * <code>.catalog.Drink drink = 2;</code>
     */
    public boolean hasDrink() {
      return drinkBuilder_ != null || drink_ != null;
    }
    /**
     * <code>.catalog.Drink drink = 2;</code>
     */
    public io.prodrink.catalog.generated.domain.Drink getDrink() {
      if (drinkBuilder_ == null) {
        return drink_ == null ? io.prodrink.catalog.generated.domain.Drink.getDefaultInstance() : drink_;
      } else {
        return drinkBuilder_.getMessage();
      }
    }
    /**
     * <code>.catalog.Drink drink = 2;</code>
     */
    public Builder setDrink(io.prodrink.catalog.generated.domain.Drink value) {
      if (drinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        drink_ = value;
        onChanged();
      } else {
        drinkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.catalog.Drink drink = 2;</code>
     */
    public Builder setDrink(
        io.prodrink.catalog.generated.domain.Drink.Builder builderForValue) {
      if (drinkBuilder_ == null) {
        drink_ = builderForValue.build();
        onChanged();
      } else {
        drinkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.catalog.Drink drink = 2;</code>
     */
    public Builder mergeDrink(io.prodrink.catalog.generated.domain.Drink value) {
      if (drinkBuilder_ == null) {
        if (drink_ != null) {
          drink_ =
            io.prodrink.catalog.generated.domain.Drink.newBuilder(drink_).mergeFrom(value).buildPartial();
        } else {
          drink_ = value;
        }
        onChanged();
      } else {
        drinkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.catalog.Drink drink = 2;</code>
     */
    public Builder clearDrink() {
      if (drinkBuilder_ == null) {
        drink_ = null;
        onChanged();
      } else {
        drink_ = null;
        drinkBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.catalog.Drink drink = 2;</code>
     */
    public io.prodrink.catalog.generated.domain.Drink.Builder getDrinkBuilder() {
      
      onChanged();
      return getDrinkFieldBuilder().getBuilder();
    }
    /**
     * <code>.catalog.Drink drink = 2;</code>
     */
    public io.prodrink.catalog.generated.domain.DrinkOrBuilder getDrinkOrBuilder() {
      if (drinkBuilder_ != null) {
        return drinkBuilder_.getMessageOrBuilder();
      } else {
        return drink_ == null ?
            io.prodrink.catalog.generated.domain.Drink.getDefaultInstance() : drink_;
      }
    }
    /**
     * <code>.catalog.Drink drink = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.prodrink.catalog.generated.domain.Drink, io.prodrink.catalog.generated.domain.Drink.Builder, io.prodrink.catalog.generated.domain.DrinkOrBuilder> 
        getDrinkFieldBuilder() {
      if (drinkBuilder_ == null) {
        drinkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.prodrink.catalog.generated.domain.Drink, io.prodrink.catalog.generated.domain.Drink.Builder, io.prodrink.catalog.generated.domain.DrinkOrBuilder>(
                getDrink(),
                getParentForChildren(),
                isClean());
        drink_ = null;
      }
      return drinkBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:catalog.DrinkUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:catalog.DrinkUpdateRequest)
  private static final io.prodrink.catalog.generated.dto.DrinkUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.prodrink.catalog.generated.dto.DrinkUpdateRequest();
  }

  public static io.prodrink.catalog.generated.dto.DrinkUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DrinkUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<DrinkUpdateRequest>() {
    public DrinkUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DrinkUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DrinkUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DrinkUpdateRequest> getParserForType() {
    return PARSER;
  }

  public io.prodrink.catalog.generated.dto.DrinkUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
