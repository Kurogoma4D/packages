// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
// Autogenerated from Pigeon (v22.4.1), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package io.flutter.plugins.camera;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression", "serial"})
public class Messages {

  /** Error class for passing custom error details to Flutter via a thrown PlatformException. */
  public static class FlutterError extends RuntimeException {

    /** The error code. */
    public final String code;

    /** The error details. Must be a datatype supported by the api codec. */
    public final Object details;

    public FlutterError(@NonNull String code, @Nullable String message, @Nullable Object details) {
      super(message);
      this.code = code;
      this.details = details;
    }
  }

  @NonNull
  protected static ArrayList<Object> wrapError(@NonNull Throwable exception) {
    ArrayList<Object> errorList = new ArrayList<>(3);
    if (exception instanceof FlutterError) {
      FlutterError error = (FlutterError) exception;
      errorList.add(error.code);
      errorList.add(error.getMessage());
      errorList.add(error.details);
    } else {
      errorList.add(exception.toString());
      errorList.add(exception.getClass().getSimpleName());
      errorList.add(
          "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }
    return errorList;
  }

  @Target(METHOD)
  @Retention(CLASS)
  @interface CanIgnoreReturnValue {}

  public enum PlatformCameraLensDirection {
    FRONT(0),
    BACK(1),
    EXTERNAL(2);

    final int index;

    PlatformCameraLensDirection(final int index) {
      this.index = index;
    }
  }

  /** Generated class from Pigeon that represents data sent in messages. */
  public static final class PlatformCameraDescription {
    private @NonNull String name;

    public @NonNull String getName() {
      return name;
    }

    public void setName(@NonNull String setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"name\" is null.");
      }
      this.name = setterArg;
    }

    private @NonNull PlatformCameraLensDirection lensDirection;

    public @NonNull PlatformCameraLensDirection getLensDirection() {
      return lensDirection;
    }

    public void setLensDirection(@NonNull PlatformCameraLensDirection setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"lensDirection\" is null.");
      }
      this.lensDirection = setterArg;
    }

    private @NonNull Long sensorOrientation;

    public @NonNull Long getSensorOrientation() {
      return sensorOrientation;
    }

    public void setSensorOrientation(@NonNull Long setterArg) {
      if (setterArg == null) {
        throw new IllegalStateException("Nonnull field \"sensorOrientation\" is null.");
      }
      this.sensorOrientation = setterArg;
    }

    /** Constructor is non-public to enforce null safety; use Builder. */
    PlatformCameraDescription() {}

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      PlatformCameraDescription that = (PlatformCameraDescription) o;
      return name.equals(that.name)
          && lensDirection.equals(that.lensDirection)
          && sensorOrientation.equals(that.sensorOrientation);
    }

    @Override
    public int hashCode() {
      return Objects.hash(name, lensDirection, sensorOrientation);
    }

    public static final class Builder {

      private @Nullable String name;

      @CanIgnoreReturnValue
      public @NonNull Builder setName(@NonNull String setterArg) {
        this.name = setterArg;
        return this;
      }

      private @Nullable PlatformCameraLensDirection lensDirection;

      @CanIgnoreReturnValue
      public @NonNull Builder setLensDirection(@NonNull PlatformCameraLensDirection setterArg) {
        this.lensDirection = setterArg;
        return this;
      }

      private @Nullable Long sensorOrientation;

      @CanIgnoreReturnValue
      public @NonNull Builder setSensorOrientation(@NonNull Long setterArg) {
        this.sensorOrientation = setterArg;
        return this;
      }

      public @NonNull PlatformCameraDescription build() {
        PlatformCameraDescription pigeonReturn = new PlatformCameraDescription();
        pigeonReturn.setName(name);
        pigeonReturn.setLensDirection(lensDirection);
        pigeonReturn.setSensorOrientation(sensorOrientation);
        return pigeonReturn;
      }
    }

    @NonNull
    ArrayList<Object> toList() {
      ArrayList<Object> toListResult = new ArrayList<>(3);
      toListResult.add(name);
      toListResult.add(lensDirection);
      toListResult.add(sensorOrientation);
      return toListResult;
    }

    static @NonNull PlatformCameraDescription fromList(@NonNull ArrayList<Object> pigeonVar_list) {
      PlatformCameraDescription pigeonResult = new PlatformCameraDescription();
      Object name = pigeonVar_list.get(0);
      pigeonResult.setName((String) name);
      Object lensDirection = pigeonVar_list.get(1);
      pigeonResult.setLensDirection((PlatformCameraLensDirection) lensDirection);
      Object sensorOrientation = pigeonVar_list.get(2);
      pigeonResult.setSensorOrientation((Long) sensorOrientation);
      return pigeonResult;
    }
  }

  private static class PigeonCodec extends StandardMessageCodec {
    public static final PigeonCodec INSTANCE = new PigeonCodec();

    private PigeonCodec() {}

    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte) 129:
          {
            Object value = readValue(buffer);
            return value == null
                ? null
                : PlatformCameraLensDirection.values()[((Long) value).intValue()];
          }
        case (byte) 130:
          return PlatformCameraDescription.fromList((ArrayList<Object>) readValue(buffer));
        default:
          return super.readValueOfType(type, buffer);
      }
    }

    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value) {
      if (value instanceof PlatformCameraLensDirection) {
        stream.write(129);
        writeValue(stream, value == null ? null : ((PlatformCameraLensDirection) value).index);
      } else if (value instanceof PlatformCameraDescription) {
        stream.write(130);
        writeValue(stream, ((PlatformCameraDescription) value).toList());
      } else {
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface CameraApi {

    @NonNull
    List<PlatformCameraDescription> getAvailableCameras();

    /** The codec used by CameraApi. */
    static @NonNull MessageCodec<Object> getCodec() {
      return PigeonCodec.INSTANCE;
    }
    /** Sets up an instance of `CameraApi` to handle messages through the `binaryMessenger`. */
    static void setUp(@NonNull BinaryMessenger binaryMessenger, @Nullable CameraApi api) {
      setUp(binaryMessenger, "", api);
    }

    static void setUp(
        @NonNull BinaryMessenger binaryMessenger,
        @NonNull String messageChannelSuffix,
        @Nullable CameraApi api) {
      messageChannelSuffix = messageChannelSuffix.isEmpty() ? "" : "." + messageChannelSuffix;
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(
                binaryMessenger,
                "dev.flutter.pigeon.camera_android.CameraApi.getAvailableCameras"
                    + messageChannelSuffix,
                getCodec());
        if (api != null) {
          channel.setMessageHandler(
              (message, reply) -> {
                ArrayList<Object> wrapped = new ArrayList<>();
                try {
                  List<PlatformCameraDescription> output = api.getAvailableCameras();
                  wrapped.add(0, output);
                } catch (Throwable exception) {
                  wrapped = wrapError(exception);
                }
                reply.reply(wrapped);
              });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
}