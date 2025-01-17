// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

/**
 *
 *
 * <pre>
 * Request to create an album in Google Photos.
 * </pre>
 *
 * Protobuf type {@code google.photos.library.v1.CreateAlbumRequest}
 */
public final class CreateAlbumRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.photos.library.v1.CreateAlbumRequest)
    CreateAlbumRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateAlbumRequest.newBuilder() to construct.
  private CreateAlbumRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateAlbumRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateAlbumRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateAlbumRequest(
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
              com.google.photos.types.proto.Album.Builder subBuilder = null;
              if (album_ != null) {
                subBuilder = album_.toBuilder();
              }
              album_ =
                  input.readMessage(
                      com.google.photos.types.proto.Album.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(album_);
                album_ = subBuilder.buildPartial();
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
        .internal_static_google_photos_library_v1_CreateAlbumRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_CreateAlbumRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.photos.library.v1.proto.CreateAlbumRequest.class,
            com.google.photos.library.v1.proto.CreateAlbumRequest.Builder.class);
  }

  public static final int ALBUM_FIELD_NUMBER = 1;
  private com.google.photos.types.proto.Album album_;
  /**
   *
   *
   * <pre>
   * Required. The album to be created.
   * </pre>
   *
   * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the album field is set.
   */
  @java.lang.Override
  public boolean hasAlbum() {
    return album_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The album to be created.
   * </pre>
   *
   * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The album.
   */
  @java.lang.Override
  public com.google.photos.types.proto.Album getAlbum() {
    return album_ == null ? com.google.photos.types.proto.Album.getDefaultInstance() : album_;
  }
  /**
   *
   *
   * <pre>
   * Required. The album to be created.
   * </pre>
   *
   * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.photos.types.proto.AlbumOrBuilder getAlbumOrBuilder() {
    return getAlbum();
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
    if (album_ != null) {
      output.writeMessage(1, getAlbum());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (album_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAlbum());
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
    if (!(obj instanceof com.google.photos.library.v1.proto.CreateAlbumRequest)) {
      return super.equals(obj);
    }
    com.google.photos.library.v1.proto.CreateAlbumRequest other =
        (com.google.photos.library.v1.proto.CreateAlbumRequest) obj;

    if (hasAlbum() != other.hasAlbum()) return false;
    if (hasAlbum()) {
      if (!getAlbum().equals(other.getAlbum())) return false;
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
    if (hasAlbum()) {
      hash = (37 * hash) + ALBUM_FIELD_NUMBER;
      hash = (53 * hash) + getAlbum().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.photos.library.v1.proto.CreateAlbumRequest prototype) {
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
   * Request to create an album in Google Photos.
   * </pre>
   *
   * Protobuf type {@code google.photos.library.v1.CreateAlbumRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.photos.library.v1.CreateAlbumRequest)
      com.google.photos.library.v1.proto.CreateAlbumRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_CreateAlbumRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_CreateAlbumRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.photos.library.v1.proto.CreateAlbumRequest.class,
              com.google.photos.library.v1.proto.CreateAlbumRequest.Builder.class);
    }

    // Construct using com.google.photos.library.v1.proto.CreateAlbumRequest.newBuilder()
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
      if (albumBuilder_ == null) {
        album_ = null;
      } else {
        album_ = null;
        albumBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_CreateAlbumRequest_descriptor;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.CreateAlbumRequest getDefaultInstanceForType() {
      return com.google.photos.library.v1.proto.CreateAlbumRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.CreateAlbumRequest build() {
      com.google.photos.library.v1.proto.CreateAlbumRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.CreateAlbumRequest buildPartial() {
      com.google.photos.library.v1.proto.CreateAlbumRequest result =
          new com.google.photos.library.v1.proto.CreateAlbumRequest(this);
      if (albumBuilder_ == null) {
        result.album_ = album_;
      } else {
        result.album_ = albumBuilder_.build();
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
      if (other instanceof com.google.photos.library.v1.proto.CreateAlbumRequest) {
        return mergeFrom((com.google.photos.library.v1.proto.CreateAlbumRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.photos.library.v1.proto.CreateAlbumRequest other) {
      if (other == com.google.photos.library.v1.proto.CreateAlbumRequest.getDefaultInstance())
        return this;
      if (other.hasAlbum()) {
        mergeAlbum(other.getAlbum());
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
      com.google.photos.library.v1.proto.CreateAlbumRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.photos.library.v1.proto.CreateAlbumRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.photos.types.proto.Album album_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.photos.types.proto.Album,
            com.google.photos.types.proto.Album.Builder,
            com.google.photos.types.proto.AlbumOrBuilder>
        albumBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The album to be created.
     * </pre>
     *
     * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the album field is set.
     */
    public boolean hasAlbum() {
      return albumBuilder_ != null || album_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The album to be created.
     * </pre>
     *
     * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The album.
     */
    public com.google.photos.types.proto.Album getAlbum() {
      if (albumBuilder_ == null) {
        return album_ == null ? com.google.photos.types.proto.Album.getDefaultInstance() : album_;
      } else {
        return albumBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The album to be created.
     * </pre>
     *
     * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAlbum(com.google.photos.types.proto.Album value) {
      if (albumBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        album_ = value;
        onChanged();
      } else {
        albumBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The album to be created.
     * </pre>
     *
     * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setAlbum(com.google.photos.types.proto.Album.Builder builderForValue) {
      if (albumBuilder_ == null) {
        album_ = builderForValue.build();
        onChanged();
      } else {
        albumBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The album to be created.
     * </pre>
     *
     * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeAlbum(com.google.photos.types.proto.Album value) {
      if (albumBuilder_ == null) {
        if (album_ != null) {
          album_ =
              com.google.photos.types.proto.Album.newBuilder(album_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          album_ = value;
        }
        onChanged();
      } else {
        albumBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The album to be created.
     * </pre>
     *
     * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearAlbum() {
      if (albumBuilder_ == null) {
        album_ = null;
        onChanged();
      } else {
        album_ = null;
        albumBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The album to be created.
     * </pre>
     *
     * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.photos.types.proto.Album.Builder getAlbumBuilder() {

      onChanged();
      return getAlbumFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The album to be created.
     * </pre>
     *
     * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.photos.types.proto.AlbumOrBuilder getAlbumOrBuilder() {
      if (albumBuilder_ != null) {
        return albumBuilder_.getMessageOrBuilder();
      } else {
        return album_ == null ? com.google.photos.types.proto.Album.getDefaultInstance() : album_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The album to be created.
     * </pre>
     *
     * <code>.google.photos.types.Album album = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.photos.types.proto.Album,
            com.google.photos.types.proto.Album.Builder,
            com.google.photos.types.proto.AlbumOrBuilder>
        getAlbumFieldBuilder() {
      if (albumBuilder_ == null) {
        albumBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.photos.types.proto.Album,
                com.google.photos.types.proto.Album.Builder,
                com.google.photos.types.proto.AlbumOrBuilder>(
                getAlbum(), getParentForChildren(), isClean());
        album_ = null;
      }
      return albumBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.photos.library.v1.CreateAlbumRequest)
  }

  // @@protoc_insertion_point(class_scope:google.photos.library.v1.CreateAlbumRequest)
  private static final com.google.photos.library.v1.proto.CreateAlbumRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.photos.library.v1.proto.CreateAlbumRequest();
  }

  public static com.google.photos.library.v1.proto.CreateAlbumRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAlbumRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateAlbumRequest>() {
        @java.lang.Override
        public CreateAlbumRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateAlbumRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateAlbumRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAlbumRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.photos.library.v1.proto.CreateAlbumRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
