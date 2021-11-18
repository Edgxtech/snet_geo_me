// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geo-me.proto

package au.com.ausstaker.snet.server;

public interface ObservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Observation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string assetId = 2;</code>
   * @return The assetId.
   */
  java.lang.String getAssetId();
  /**
   * <code>string assetId = 2;</code>
   * @return The bytes for assetId.
   */
  com.google.protobuf.ByteString
      getAssetIdBytes();

  /**
   * <code>double lat = 3;</code>
   * @return The lat.
   */
  double getLat();

  /**
   * <code>double lon = 4;</code>
   * @return The lon.
   */
  double getLon();

  /**
   * <code>double x = 5;</code>
   * @return The x.
   */
  double getX();

  /**
   * <code>double y = 6;</code>
   * @return The y.
   */
  double getY();

  /**
   * <code>double meas = 7;</code>
   * @return The meas.
   */
  double getMeas();

  /**
   * <code>string type = 8;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 8;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
