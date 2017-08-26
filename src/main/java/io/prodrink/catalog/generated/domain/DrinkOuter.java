// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog/drink.proto

package io.prodrink.catalog.generated.domain;

public final class DrinkOuter {
  private DrinkOuter() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_catalog_Drink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_catalog_Drink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_catalog_Category_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_catalog_Category_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_catalog_PropertyType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_catalog_PropertyType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_catalog_Property_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_catalog_Property_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023catalog/drink.proto\022\007catalog\"\226\001\n\005Drink" +
      "\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022#\n\010category\030\003" +
      " \001(\0132\021.catalog.Category\022%\n\nproperties\030\004 " +
      "\003(\0132\021.catalog.Property\022\022\n\nimage_urls\030\005 \003" +
      "(\t\022\023\n\013description\030\006 \001(\t\"\222\001\n\010Category\022\n\n\002" +
      "id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022*\n\017parent_categor" +
      "y\030\003 \001(\0132\021.catalog.Category\022-\n\016property_t" +
      "ypes\030\004 \003(\0132\025.catalog.PropertyType\022\021\n\tima" +
      "ge_url\030\005 \001(\t\"J\n\014PropertyType\022\n\n\002id\030\001 \001(\005" +
      "\022\014\n\004name\030\002 \001(\t\022 \n\004type\030\003 \001(\0162\022.catalog.V",
      "alueType\"R\n\010Property\022\n\n\002id\030\001 \001(\005\022+\n\014prop" +
      "ertyType\030\002 \001(\0132\025.catalog.PropertyType\022\r\n" +
      "\005value\030\003 \001(\t*E\n\tValueType\022\t\n\005INT32\020\000\022\t\n\005" +
      "INT64\020\001\022\t\n\005FLOAT\020\002\022\n\n\006STRING\020\003\022\013\n\007BOOLEA" +
      "N\020\004BG\n$io.prodrink.catalog.generated.dom" +
      "ainB\nDrinkOuterP\001\252\002\020prodrink.catalogb\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_catalog_Drink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_catalog_Drink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_catalog_Drink_descriptor,
        new java.lang.String[] { "Id", "Name", "Category", "Properties", "ImageUrls", "Description", });
    internal_static_catalog_Category_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_catalog_Category_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_catalog_Category_descriptor,
        new java.lang.String[] { "Id", "Name", "ParentCategory", "PropertyTypes", "ImageUrl", });
    internal_static_catalog_PropertyType_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_catalog_PropertyType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_catalog_PropertyType_descriptor,
        new java.lang.String[] { "Id", "Name", "Type", });
    internal_static_catalog_Property_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_catalog_Property_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_catalog_Property_descriptor,
        new java.lang.String[] { "Id", "PropertyType", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}