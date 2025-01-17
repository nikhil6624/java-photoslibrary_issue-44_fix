// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface ShareAlbumRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.ShareAlbumRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Identifier of the album to be shared. This `albumId` must belong to an
   * album created by the developer.
   * </pre>
   *
   * <code>string album_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The albumId.
   */
  java.lang.String getAlbumId();
  /**
   *
   *
   * <pre>
   * Required. Identifier of the album to be shared. This `albumId` must belong to an
   * album created by the developer.
   * </pre>
   *
   * <code>string album_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for albumId.
   */
  com.google.protobuf.ByteString getAlbumIdBytes();

  /**
   *
   *
   * <pre>
   * Options to be set when converting the album to a shared album.
   * </pre>
   *
   * <code>.google.photos.types.SharedAlbumOptions shared_album_options = 2;</code>
   *
   * @return Whether the sharedAlbumOptions field is set.
   */
  boolean hasSharedAlbumOptions();
  /**
   *
   *
   * <pre>
   * Options to be set when converting the album to a shared album.
   * </pre>
   *
   * <code>.google.photos.types.SharedAlbumOptions shared_album_options = 2;</code>
   *
   * @return The sharedAlbumOptions.
   */
  com.google.photos.types.proto.SharedAlbumOptions getSharedAlbumOptions();
  /**
   *
   *
   * <pre>
   * Options to be set when converting the album to a shared album.
   * </pre>
   *
   * <code>.google.photos.types.SharedAlbumOptions shared_album_options = 2;</code>
   */
  com.google.photos.types.proto.SharedAlbumOptionsOrBuilder getSharedAlbumOptionsOrBuilder();
}
