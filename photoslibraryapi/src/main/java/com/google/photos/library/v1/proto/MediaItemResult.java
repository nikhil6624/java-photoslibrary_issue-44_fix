// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

/**
 *
 *
 * <pre>
 * Result of retrieving a media item.
 * </pre>
 *
 * Protobuf type {@code google.photos.library.v1.MediaItemResult}
 */
public final class MediaItemResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.photos.library.v1.MediaItemResult)
    MediaItemResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MediaItemResult.newBuilder() to construct.
  private MediaItemResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MediaItemResult() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MediaItemResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MediaItemResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.rpc.Status.Builder subBuilder = null;
              if (status_ != null) {
                subBuilder = status_.toBuilder();
              }
              status_ = input.readMessage(com.google.rpc.Status.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(status_);
                status_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.photos.types.proto.MediaItem.Builder subBuilder = null;
              if (mediaItem_ != null) {
                subBuilder = mediaItem_.toBuilder();
              }
              mediaItem_ =
                  input.readMessage(
                      com.google.photos.types.proto.MediaItem.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(mediaItem_);
                mediaItem_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_MediaItemResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_MediaItemResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.photos.library.v1.proto.MediaItemResult.class,
            com.google.photos.library.v1.proto.MediaItemResult.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.google.rpc.Status status_;
  /**
   *
   *
   * <pre>
   * If an error occurred while accessing this media item, this field
   * is populated with information related to the error. For details regarding
   * this field, see [Status][google.rpc.Status].
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   *
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   *
   *
   * <pre>
   * If an error occurred while accessing this media item, this field
   * is populated with information related to the error. For details regarding
   * this field, see [Status][google.rpc.Status].
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   *
   * @return The status.
   */
  @java.lang.Override
  public com.google.rpc.Status getStatus() {
    return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
  }
  /**
   *
   *
   * <pre>
   * If an error occurred while accessing this media item, this field
   * is populated with information related to the error. For details regarding
   * this field, see [Status][google.rpc.Status].
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
  }

  public static final int MEDIA_ITEM_FIELD_NUMBER = 2;
  private com.google.photos.types.proto.MediaItem mediaItem_;
  /**
   *
   *
   * <pre>
   * Media item retrieved from the user's library. It's populated if no errors
   * occurred and the media item was fetched successfully.
   * </pre>
   *
   * <code>.google.photos.types.MediaItem media_item = 2;</code>
   *
   * @return Whether the mediaItem field is set.
   */
  @java.lang.Override
  public boolean hasMediaItem() {
    return mediaItem_ != null;
  }
  /**
   *
   *
   * <pre>
   * Media item retrieved from the user's library. It's populated if no errors
   * occurred and the media item was fetched successfully.
   * </pre>
   *
   * <code>.google.photos.types.MediaItem media_item = 2;</code>
   *
   * @return The mediaItem.
   */
  @java.lang.Override
  public com.google.photos.types.proto.MediaItem getMediaItem() {
    return mediaItem_ == null
        ? com.google.photos.types.proto.MediaItem.getDefaultInstance()
        : mediaItem_;
  }
  /**
   *
   *
   * <pre>
   * Media item retrieved from the user's library. It's populated if no errors
   * occurred and the media item was fetched successfully.
   * </pre>
   *
   * <code>.google.photos.types.MediaItem media_item = 2;</code>
   */
  @java.lang.Override
  public com.google.photos.types.proto.MediaItemOrBuilder getMediaItemOrBuilder() {
    return getMediaItem();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    if (mediaItem_ != null) {
      output.writeMessage(2, getMediaItem());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStatus());
    }
    if (mediaItem_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMediaItem());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.photos.library.v1.proto.MediaItemResult)) {
      return super.equals(obj);
    }
    com.google.photos.library.v1.proto.MediaItemResult other =
        (com.google.photos.library.v1.proto.MediaItemResult) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus().equals(other.getStatus())) return false;
    }
    if (hasMediaItem() != other.hasMediaItem()) return false;
    if (hasMediaItem()) {
      if (!getMediaItem().equals(other.getMediaItem())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    if (hasMediaItem()) {
      hash = (37 * hash) + MEDIA_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getMediaItem().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.MediaItemResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.photos.library.v1.proto.MediaItemResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Result of retrieving a media item.
   * </pre>
   *
   * Protobuf type {@code google.photos.library.v1.MediaItemResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.photos.library.v1.MediaItemResult)
      com.google.photos.library.v1.proto.MediaItemResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_MediaItemResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_MediaItemResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.photos.library.v1.proto.MediaItemResult.class,
              com.google.photos.library.v1.proto.MediaItemResult.Builder.class);
    }

    // Construct using com.google.photos.library.v1.proto.MediaItemResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      if (mediaItemBuilder_ == null) {
        mediaItem_ = null;
      } else {
        mediaItem_ = null;
        mediaItemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_MediaItemResult_descriptor;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.MediaItemResult getDefaultInstanceForType() {
      return com.google.photos.library.v1.proto.MediaItemResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.MediaItemResult build() {
      com.google.photos.library.v1.proto.MediaItemResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.MediaItemResult buildPartial() {
      com.google.photos.library.v1.proto.MediaItemResult result =
          new com.google.photos.library.v1.proto.MediaItemResult(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      if (mediaItemBuilder_ == null) {
        result.mediaItem_ = mediaItem_;
      } else {
        result.mediaItem_ = mediaItemBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.photos.library.v1.proto.MediaItemResult) {
        return mergeFrom((com.google.photos.library.v1.proto.MediaItemResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.photos.library.v1.proto.MediaItemResult other) {
      if (other == com.google.photos.library.v1.proto.MediaItemResult.getDefaultInstance())
        return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      if (other.hasMediaItem()) {
        mergeMediaItem(other.getMediaItem());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.photos.library.v1.proto.MediaItemResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.photos.library.v1.proto.MediaItemResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.rpc.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        statusBuilder_;
    /**
     *
     *
     * <pre>
     * If an error occurred while accessing this media item, this field
     * is populated with information related to the error. For details regarding
     * this field, see [Status][google.rpc.Status].
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     *
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     *
     *
     * <pre>
     * If an error occurred while accessing this media item, this field
     * is populated with information related to the error. For details regarding
     * this field, see [Status][google.rpc.Status].
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     *
     * @return The status.
     */
    public com.google.rpc.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * If an error occurred while accessing this media item, this field
     * is populated with information related to the error. For details regarding
     * this field, see [Status][google.rpc.Status].
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public Builder setStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If an error occurred while accessing this media item, this field
     * is populated with information related to the error. For details regarding
     * this field, see [Status][google.rpc.Status].
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public Builder setStatus(com.google.rpc.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If an error occurred while accessing this media item, this field
     * is populated with information related to the error. For details regarding
     * this field, see [Status][google.rpc.Status].
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public Builder mergeStatus(com.google.rpc.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ = com.google.rpc.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If an error occurred while accessing this media item, this field
     * is populated with information related to the error. For details regarding
     * this field, see [Status][google.rpc.Status].
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If an error occurred while accessing this media item, this field
     * is populated with information related to the error. For details regarding
     * this field, see [Status][google.rpc.Status].
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public com.google.rpc.Status.Builder getStatusBuilder() {

      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If an error occurred while accessing this media item, this field
     * is populated with information related to the error. For details regarding
     * this field, see [Status][google.rpc.Status].
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    public com.google.rpc.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ? com.google.rpc.Status.getDefaultInstance() : status_;
      }
    }
    /**
     *
     *
     * <pre>
     * If an error occurred while accessing this media item, this field
     * is populated with information related to the error. For details regarding
     * this field, see [Status][google.rpc.Status].
     * </pre>
     *
     * <code>.google.rpc.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.Status,
                com.google.rpc.Status.Builder,
                com.google.rpc.StatusOrBuilder>(getStatus(), getParentForChildren(), isClean());
        status_ = null;
      }
      return statusBuilder_;
    }

    private com.google.photos.types.proto.MediaItem mediaItem_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.photos.types.proto.MediaItem,
            com.google.photos.types.proto.MediaItem.Builder,
            com.google.photos.types.proto.MediaItemOrBuilder>
        mediaItemBuilder_;
    /**
     *
     *
     * <pre>
     * Media item retrieved from the user's library. It's populated if no errors
     * occurred and the media item was fetched successfully.
     * </pre>
     *
     * <code>.google.photos.types.MediaItem media_item = 2;</code>
     *
     * @return Whether the mediaItem field is set.
     */
    public boolean hasMediaItem() {
      return mediaItemBuilder_ != null || mediaItem_ != null;
    }
    /**
     *
     *
     * <pre>
     * Media item retrieved from the user's library. It's populated if no errors
     * occurred and the media item was fetched successfully.
     * </pre>
     *
     * <code>.google.photos.types.MediaItem media_item = 2;</code>
     *
     * @return The mediaItem.
     */
    public com.google.photos.types.proto.MediaItem getMediaItem() {
      if (mediaItemBuilder_ == null) {
        return mediaItem_ == null
            ? com.google.photos.types.proto.MediaItem.getDefaultInstance()
            : mediaItem_;
      } else {
        return mediaItemBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Media item retrieved from the user's library. It's populated if no errors
     * occurred and the media item was fetched successfully.
     * </pre>
     *
     * <code>.google.photos.types.MediaItem media_item = 2;</code>
     */
    public Builder setMediaItem(com.google.photos.types.proto.MediaItem value) {
      if (mediaItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mediaItem_ = value;
        onChanged();
      } else {
        mediaItemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Media item retrieved from the user's library. It's populated if no errors
     * occurred and the media item was fetched successfully.
     * </pre>
     *
     * <code>.google.photos.types.MediaItem media_item = 2;</code>
     */
    public Builder setMediaItem(com.google.photos.types.proto.MediaItem.Builder builderForValue) {
      if (mediaItemBuilder_ == null) {
        mediaItem_ = builderForValue.build();
        onChanged();
      } else {
        mediaItemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Media item retrieved from the user's library. It's populated if no errors
     * occurred and the media item was fetched successfully.
     * </pre>
     *
     * <code>.google.photos.types.MediaItem media_item = 2;</code>
     */
    public Builder mergeMediaItem(com.google.photos.types.proto.MediaItem value) {
      if (mediaItemBuilder_ == null) {
        if (mediaItem_ != null) {
          mediaItem_ =
              com.google.photos.types.proto.MediaItem.newBuilder(mediaItem_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          mediaItem_ = value;
        }
        onChanged();
      } else {
        mediaItemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Media item retrieved from the user's library. It's populated if no errors
     * occurred and the media item was fetched successfully.
     * </pre>
     *
     * <code>.google.photos.types.MediaItem media_item = 2;</code>
     */
    public Builder clearMediaItem() {
      if (mediaItemBuilder_ == null) {
        mediaItem_ = null;
        onChanged();
      } else {
        mediaItem_ = null;
        mediaItemBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Media item retrieved from the user's library. It's populated if no errors
     * occurred and the media item was fetched successfully.
     * </pre>
     *
     * <code>.google.photos.types.MediaItem media_item = 2;</code>
     */
    public com.google.photos.types.proto.MediaItem.Builder getMediaItemBuilder() {

      onChanged();
      return getMediaItemFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Media item retrieved from the user's library. It's populated if no errors
     * occurred and the media item was fetched successfully.
     * </pre>
     *
     * <code>.google.photos.types.MediaItem media_item = 2;</code>
     */
    public com.google.photos.types.proto.MediaItemOrBuilder getMediaItemOrBuilder() {
      if (mediaItemBuilder_ != null) {
        return mediaItemBuilder_.getMessageOrBuilder();
      } else {
        return mediaItem_ == null
            ? com.google.photos.types.proto.MediaItem.getDefaultInstance()
            : mediaItem_;
      }
    }
    /**
     *
     *
     * <pre>
     * Media item retrieved from the user's library. It's populated if no errors
     * occurred and the media item was fetched successfully.
     * </pre>
     *
     * <code>.google.photos.types.MediaItem media_item = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.photos.types.proto.MediaItem,
            com.google.photos.types.proto.MediaItem.Builder,
            com.google.photos.types.proto.MediaItemOrBuilder>
        getMediaItemFieldBuilder() {
      if (mediaItemBuilder_ == null) {
        mediaItemBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.photos.types.proto.MediaItem,
                com.google.photos.types.proto.MediaItem.Builder,
                com.google.photos.types.proto.MediaItemOrBuilder>(
                getMediaItem(), getParentForChildren(), isClean());
        mediaItem_ = null;
      }
      return mediaItemBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.photos.library.v1.MediaItemResult)
  }

  // @@protoc_insertion_point(class_scope:google.photos.library.v1.MediaItemResult)
  private static final com.google.photos.library.v1.proto.MediaItemResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.photos.library.v1.proto.MediaItemResult();
  }

  public static com.google.photos.library.v1.proto.MediaItemResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaItemResult> PARSER =
      new com.google.protobuf.AbstractParser<MediaItemResult>() {
        @java.lang.Override
        public MediaItemResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MediaItemResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MediaItemResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaItemResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.photos.library.v1.proto.MediaItemResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
