// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geo-me.proto

package au.com.ausstaker.snet.server;

public interface GeoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GeoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Observation observation = 1;</code>
   */
  java.util.List<au.com.ausstaker.snet.server.Observation> 
      getObservationList();
  /**
   * <code>repeated .Observation observation = 1;</code>
   */
  au.com.ausstaker.snet.server.Observation getObservation(int index);
  /**
   * <code>repeated .Observation observation = 1;</code>
   */
  int getObservationCount();
  /**
   * <code>repeated .Observation observation = 1;</code>
   */
  java.util.List<? extends au.com.ausstaker.snet.server.ObservationOrBuilder> 
      getObservationOrBuilderList();
  /**
   * <code>repeated .Observation observation = 1;</code>
   */
  au.com.ausstaker.snet.server.ObservationOrBuilder getObservationOrBuilder(
      int index);

  /**
   * <code>.Target target = 2;</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <code>.Target target = 2;</code>
   * @return The target.
   */
  au.com.ausstaker.snet.server.Target getTarget();
  /**
   * <code>.Target target = 2;</code>
   */
  au.com.ausstaker.snet.server.TargetOrBuilder getTargetOrBuilder();

  /**
   * <code>bool provide_kml_out = 3;</code>
   * @return The provideKmlOut.
   */
  boolean getProvideKmlOut();
}
