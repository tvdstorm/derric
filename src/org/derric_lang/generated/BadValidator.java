package org.derric_lang.validator.generated;

import static org.derric_lang.validator.ByteOrder.*;

public class BADValidator extends org.derric_lang.validator.Validator {

	private boolean allowEOF = false;



	public BADValidator() { super("Bad"); }

	@Override
	public String getExtension() { return "jpeg"; }

	@Override
	public org.derric_lang.validator.ParseResult tryParseBody() throws java.io.IOException {
_currentSymbol = "( [ SOI ] )";top1: for (;;) {
if (_input.atEOF()) { return no(); } allowEOF = false;_input.mark();
if (parseSOI()) { mergeSubSequence();break top1; }
clearSubSequence();_input.reset();return no();
}
_currentSymbol = "( [ PADDING ] )*";top2: for (;;) {
if (_input.atEOF()) { return no(); } allowEOF = false;_input.mark();
if (parsePADDING()) { mergeSubSequence();continue; }
clearSubSequence();_input.reset();mergeSubSequence();break top2;
}
_currentSymbol = "( [ COMASC ] [ ] )";top3: for (;;) {
if (_input.atEOF()) { return no(); } allowEOF = false;_input.mark();
if (parseCOMASC()) { mergeSubSequence();break top3; }
clearSubSequence();_input.reset();mergeSubSequence();break top3;
}
_currentSymbol = "( [ PADDING ] )*";top4: for (;;) {
if (_input.atEOF()) { return no(); } allowEOF = false;_input.mark();
if (parsePADDING()) { mergeSubSequence();continue; }
clearSubSequence();_input.reset();mergeSubSequence();break top4;
}
_currentSymbol = "( [ APP0Picasa ] [ APP1 PADDING* APP2? ] [ APP0JFXX ] [ APP14Adobe ] [ APP0JFIF PADDING* APP0JFXX? ] [ APP13Photoshop ] [ ] )";top5: for (;;) {
if (_input.atEOF()) { return no(); } allowEOF = false;_input.mark();
if (parseAPP0Picasa()) { mergeSubSequence();break top5; }
clearSubSequence();_input.reset();_input.mark();
if (parseAPP1()) {
for (;;) {
if (parsePADDING()) { continue; }
break;
}
parseAPP2();
mergeSubSequence();break top5;
}
clearSubSequence();_input.reset();_input.mark();
if (parseAPP0JFXX()) { mergeSubSequence();break top5; }
clearSubSequence();_input.reset();_input.mark();
if (parseAPP14Adobe()) { mergeSubSequence();break top5; }
clearSubSequence();_input.reset();_input.mark();
if (parseAPP0JFIF()) {
for (;;) {
if (parsePADDING()) { continue; }
break;
}
parseAPP0JFXX();
mergeSubSequence();break top5;
}
clearSubSequence();_input.reset();_input.mark();
if (parseAPP13Photoshop()) { mergeSubSequence();break top5; }
clearSubSequence();_input.reset();mergeSubSequence();break top5;
}
_currentSymbol = "( [ PADDING ] )*";top6: for (;;) {
if (_input.atEOF()) { return no(); } allowEOF = false;_input.mark();
if (parsePADDING()) { mergeSubSequence();continue; }
clearSubSequence();_input.reset();mergeSubSequence();break top6;
}
_currentSymbol = "( [ SOF2 PADDING* ] [ SOF3 PADDING* ] [ DHT PADDING* ] [ SOF0 PADDING* ] [ DQT PADDING* ] [ SOF1 PADDING* ] [ APPX PADDING* ] [ COMElanGmk PADDING* ] [ DRI PADDING* ] )*";top7: for (;;) {
if (_input.atEOF()) { return no(); } allowEOF = false;_input.mark();
if (parseSOF2()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top7;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseSOF3()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top7;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseDHT()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top7;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseSOF0()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top7;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseDQT()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top7;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseSOF1()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top7;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseAPPX()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top7;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseCOMElanGmk()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top7;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseDRI()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top7;
}
}
clearSubSequence();_input.reset();mergeSubSequence();break top7;
}
_currentSymbol = "( [ PADDING ] )*";top8: for (;;) {
if (_input.atEOF()) { return no(); } allowEOF = false;_input.mark();
if (parsePADDING()) { mergeSubSequence();continue; }
clearSubSequence();_input.reset();mergeSubSequence();break top8;
}
_currentSymbol = "( [ SOF2 PADDING* ] [ SOF3 PADDING* ] [ DHT PADDING* ] [ SOF0 PADDING* ] [ DQT PADDING* ] [ SOF1 PADDING* ] [ APPX PADDING* ] [ DRI PADDING* ] [ COM PADDING* ] )*";top9: for (;;) {
if (_input.atEOF()) { return no(); } allowEOF = false;_input.mark();
if (parseSOF2()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top9;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseSOF3()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top9;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseDHT()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top9;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseSOF0()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top9;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseDQT()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top9;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseSOF1()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top9;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseAPPX()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top9;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseDRI()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top9;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseCOM()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top9;
}
}
clearSubSequence();_input.reset();mergeSubSequence();break top9;
}
_currentSymbol = "( [ SOS ] )";top10: for (;;) {
if (_input.atEOF()) { return no(); } allowEOF = false;_input.mark();
if (parseSOS()) { mergeSubSequence();break top10; }
clearSubSequence();_input.reset();return no();
}
_currentSymbol = "( [ SOF2 PADDING* ] [ SOF3 PADDING* ] [ DHT PADDING* ] [ SOF0 PADDING* ] [ SOS ] [ DQT PADDING* ] [ SOF1 PADDING* ] [ APPX PADDING* ] [ DRI PADDING* ] [ COM PADDING* ] )*";top11: for (;;) {
if (_input.atEOF()) { return yes(); } allowEOF = true;_input.mark();
if (parseSOF2()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top11;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseSOF3()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top11;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseDHT()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top11;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseSOF0()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top11;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseSOS()) { mergeSubSequence();continue; }
clearSubSequence();_input.reset();_input.mark();
if (parseDQT()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top11;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseSOF1()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top11;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseAPPX()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top11;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseDRI()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top11;
}
}
clearSubSequence();_input.reset();_input.mark();
if (parseCOM()) {
for (;;) {
if (parsePADDING()) { mergeSubSequence();continue; }
mergeSubSequence();continue top11;
}
}
clearSubSequence();_input.reset();mergeSubSequence();break top11;
}
_currentSymbol = "( [ PADDING ] )*";top12: for (;;) {
if (_input.atEOF()) { return yes(); } allowEOF = true;_input.mark();
if (parsePADDING()) { mergeSubSequence();continue; }
clearSubSequence();_input.reset();mergeSubSequence();break top12;
}
_currentSymbol = "( [ ] [ EOI ] )";top13: for (;;) {
if (_input.atEOF()) { return yes(); } allowEOF = true;_input.mark();
if (parseEOI()) { mergeSubSequence();break top13; }
clearSubSequence();_input.reset();mergeSubSequence();break top13;
}

		return yes();
	}

	@Override
	public org.derric_lang.validator.ParseResult findNextFooter() throws java.io.IOException {
		return yes();
	}

private boolean parseSOI() throws java.io.IOException {markStart();long SOI_marker;SOI_marker = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(255);if (!vs2.equals(SOI_marker)) return noMatch();long SOI_marker_2;SOI_marker_2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs5 = new org.derric_lang.validator.ValueSet();vs5.addEquals(216);if (!vs5.equals(SOI_marker_2)) return noMatch();addSubSequence("SOI");return true; }
private boolean parseBIG() throws java.io.IOException {markStart();long BIG_ENDIAN;BIG_ENDIAN = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(0);if (!vs2.equals(BIG_ENDIAN)) return noMatch();addSubSequence("BIG");return true; }
private boolean parseSomeStruct() throws java.io.IOException {markStart();long SomeStruct_name;SomeStruct_name = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(74);if (!vs2.equals(SomeStruct_name)) return noMatch();long SomeStruct_name_s2;SomeStruct_name_s2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs5 = new org.derric_lang.validator.ValueSet();vs5.addEquals(101);if (!vs5.equals(SomeStruct_name_s2)) return noMatch();long SomeStruct_name_s3;SomeStruct_name_s3 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs8 = new org.derric_lang.validator.ValueSet();vs8.addEquals(114);if (!vs8.equals(SomeStruct_name_s3)) return noMatch();long SomeStruct_name_s4;SomeStruct_name_s4 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs11 = new org.derric_lang.validator.ValueSet();vs11.addEquals(111);if (!vs11.equals(SomeStruct_name_s4)) return noMatch();long SomeStruct_name_s5;SomeStruct_name_s5 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs14 = new org.derric_lang.validator.ValueSet();vs14.addEquals(101);if (!vs14.equals(SomeStruct_name_s5)) return noMatch();long SomeStruct_name_s6;SomeStruct_name_s6 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs17 = new org.derric_lang.validator.ValueSet();vs17.addEquals(110);if (!vs17.equals(SomeStruct_name_s6)) return noMatch();long SomeStruct_name_s1;SomeStruct_name_s1 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs20 = new org.derric_lang.validator.ValueSet();vs20.addEquals(0);if (!vs20.equals(SomeStruct_name_s1)) return noMatch();addSubSequence("SomeStruct");return true; }
private boolean parsePADDING() throws java.io.IOException {markStart();long PADDING_padding;PADDING_padding = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(255);if (!vs2.equals(PADDING_padding)) return noMatch();addSubSequence("PADDING");return true; }
private boolean parseAPP0JFIF() throws java.io.IOException {markStart();long APP0JFIF_marker;APP0JFIF_marker = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(224);if (!vs2.equals(APP0JFIF_marker)) return noMatch();long APP0JFIF_length;APP0JFIF_length = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(16);long APP0JFIF_identifier;APP0JFIF_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs7 = new org.derric_lang.validator.ValueSet();vs7.addEquals(74);if (!vs7.equals(APP0JFIF_identifier)) return noMatch();long APP0JFIF_identifier_s2;APP0JFIF_identifier_s2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs10 = new org.derric_lang.validator.ValueSet();vs10.addEquals(70);if (!vs10.equals(APP0JFIF_identifier_s2)) return noMatch();long APP0JFIF_identifier_s3;APP0JFIF_identifier_s3 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs13 = new org.derric_lang.validator.ValueSet();vs13.addEquals(73);if (!vs13.equals(APP0JFIF_identifier_s3)) return noMatch();long APP0JFIF_identifier_s4;APP0JFIF_identifier_s4 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs16 = new org.derric_lang.validator.ValueSet();vs16.addEquals(70);if (!vs16.equals(APP0JFIF_identifier_s4)) return noMatch();long APP0JFIF_identifier_2;APP0JFIF_identifier_2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs19 = new org.derric_lang.validator.ValueSet();vs19.addEquals(0);if (!vs19.equals(APP0JFIF_identifier_2)) return noMatch();long APP0JFIF_units;APP0JFIF_units = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs22 = new org.derric_lang.validator.ValueSet();vs22.addEquals(0);vs22.addEquals(1);vs22.addEquals(2);if (!vs22.equals(APP0JFIF_units)) return noMatch();if (!_input.skipBits(8)) return noMatch();if (!_input.skipBits(8)) return noMatch();addSubSequence("APP0JFIF");return true; }
private boolean parseAPP0JFXX() throws java.io.IOException {markStart();long APP0JFXX_marker;APP0JFXX_marker = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(224);if (!vs2.equals(APP0JFXX_marker)) return noMatch();long APP0JFXX_identifier;APP0JFXX_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs5 = new org.derric_lang.validator.ValueSet();vs5.addEquals(74);if (!vs5.equals(APP0JFXX_identifier)) return noMatch();long APP0JFXX_identifier_s2;APP0JFXX_identifier_s2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs8 = new org.derric_lang.validator.ValueSet();vs8.addEquals(70);if (!vs8.equals(APP0JFXX_identifier_s2)) return noMatch();long APP0JFXX_identifier_s3;APP0JFXX_identifier_s3 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs11 = new org.derric_lang.validator.ValueSet();vs11.addEquals(88);if (!vs11.equals(APP0JFXX_identifier_s3)) return noMatch();long APP0JFXX_identifier_s4;APP0JFXX_identifier_s4 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs14 = new org.derric_lang.validator.ValueSet();vs14.addEquals(88);if (!vs14.equals(APP0JFXX_identifier_s4)) return noMatch();long APP0JFXX_identifier_2;APP0JFXX_identifier_2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs17 = new org.derric_lang.validator.ValueSet();vs17.addEquals(0);if (!vs17.equals(APP0JFXX_identifier_2)) return noMatch();long APP0JFXX_thumbnailformat;APP0JFXX_thumbnailformat = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs20 = new org.derric_lang.validator.ValueSet();vs20.addEquals(16);vs20.addEquals(17);vs20.addEquals(19);if (!vs20.equals(APP0JFXX_thumbnailformat)) return noMatch();addSubSequence("APP0JFXX");return true; }
private boolean parseAPP0Picasa() throws java.io.IOException {markStart();long APP0Picasa_identifier;APP0Picasa_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(224);if (!vs2.equals(APP0Picasa_identifier)) return noMatch();long APP0Picasa_data;APP0Picasa_data = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs5 = new org.derric_lang.validator.ValueSet();vs5.addEquals(80);if (!vs5.equals(APP0Picasa_data)) return noMatch();long APP0Picasa_data_s2;APP0Picasa_data_s2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs8 = new org.derric_lang.validator.ValueSet();vs8.addEquals(105);if (!vs8.equals(APP0Picasa_data_s2)) return noMatch();long APP0Picasa_data_s3;APP0Picasa_data_s3 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs11 = new org.derric_lang.validator.ValueSet();vs11.addEquals(99);if (!vs11.equals(APP0Picasa_data_s3)) return noMatch();long APP0Picasa_data_s4;APP0Picasa_data_s4 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs14 = new org.derric_lang.validator.ValueSet();vs14.addEquals(97);if (!vs14.equals(APP0Picasa_data_s4)) return noMatch();long APP0Picasa_data_s5;APP0Picasa_data_s5 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs17 = new org.derric_lang.validator.ValueSet();vs17.addEquals(115);if (!vs17.equals(APP0Picasa_data_s5)) return noMatch();long APP0Picasa_data_s6;APP0Picasa_data_s6 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs20 = new org.derric_lang.validator.ValueSet();vs20.addEquals(97);if (!vs20.equals(APP0Picasa_data_s6)) return noMatch();addSubSequence("APP0Picasa");return true; }
private boolean parseAPP14Adobe() throws java.io.IOException {markStart();long APP14Adobe_identifier;APP14Adobe_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(238);if (!vs2.equals(APP14Adobe_identifier)) return noMatch();if (!_input.skipBits(8)) return noMatch();addSubSequence("APP14Adobe");return true; }
private boolean parseAPP13Photoshop() throws java.io.IOException {markStart();long APP13Photoshop_identifier;APP13Photoshop_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(237);if (!vs2.equals(APP13Photoshop_identifier)) return noMatch();if (!_input.skipBits(8)) return noMatch();addSubSequence("APP13Photoshop");return true; }
private boolean parseSegment() throws java.io.IOException {markStart();long Segment_identifier;Segment_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(208, 215);vs2.addEquals(219, 220);vs2.addEquals(223);vs2.addEquals(240, 253);if (!vs2.equals(Segment_identifier)) return noMatch();addSubSequence("Segment");return true; }
private boolean parseSOS() throws java.io.IOException {markStart();long SOS_identifier;SOS_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(218);if (!vs2.equals(SOS_identifier)) return noMatch();org.derric_lang.validator.SubStream SOS_compressedData = new org.derric_lang.validator.SubStream();long SOS_compressedData_len;SOS_compressedData_len = 0;java.util.HashMap<String, String> content1_6 = new java.util.HashMap<String, String>();content1_6.put("includeterminator", "false");java.util.HashMap<String, java.util.List<Object>> content2_6 = new java.util.HashMap<String, java.util.List<Object>>();java.util.ArrayList<Object> content2_6_0 = new java.util.ArrayList<Object>();content2_6_0.add(DQT_data);content2_6.put("quantizationtable", content2_6_0);java.util.ArrayList<Object> content2_6_1 = new java.util.ArrayList<Object>();content2_6_1.add(DHT_data);content2_6.put("huffmantable", content2_6_1);java.util.ArrayList<Object> content2_6_2 = new java.util.ArrayList<Object>();content2_6_2.add(65497l);content2_6_2.add(65476l);content2_6_2.add(65498l);content2_6.put("terminator", content2_6_2);java.util.ArrayList<Object> content2_6_3 = new java.util.ArrayList<Object>();content2_6_3.add(16l);content2_6.put("terminatorsize", content2_6_3);org.derric_lang.validator.Content content3_6 = _input.validateContent(SOS_compressedData_len, "jpegdata", content1_6, content2_6, allowEOF || true); if (!content3_6.validated) return noMatch();SOS_compressedData.fragments.add(content3_6.data);SOS_compressedData_len = SOS_compressedData.getLast().length;addSubSequence("SOS");return true; }
private boolean parseAPP1() throws java.io.IOException {markStart();long APP1_identifier;APP1_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(225);if (!vs2.equals(APP1_identifier)) return noMatch();addSubSequence("APP1");return true; }
private boolean parseAPP2() throws java.io.IOException {markStart();long APP2_identifier;APP2_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(226);if (!vs2.equals(APP2_identifier)) return noMatch();addSubSequence("APP2");return true; }
private boolean parseDQT() throws java.io.IOException {markStart();long DQT_identifier;DQT_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(219);if (!vs2.equals(DQT_identifier)) return noMatch();addSubSequence("DQT");return true; }
private boolean parseDHT() throws java.io.IOException {markStart();long DHT_identifier;DHT_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(196);if (!vs2.equals(DHT_identifier)) return noMatch();addSubSequence("DHT");return true; }
private boolean parseDRI() throws java.io.IOException {markStart();long DRI_identifier;DRI_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(221);if (!vs2.equals(DRI_identifier)) return noMatch();addSubSequence("DRI");return true; }
private boolean parseSOF0() throws java.io.IOException {markStart();long SOF0_identifier;SOF0_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(192);if (!vs2.equals(SOF0_identifier)) return noMatch();addSubSequence("SOF0");return true; }
private boolean parseSOF1() throws java.io.IOException {markStart();long SOF1_identifier;SOF1_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(193);if (!vs2.equals(SOF1_identifier)) return noMatch();addSubSequence("SOF1");return true; }
private boolean parseSOF2() throws java.io.IOException {markStart();long SOF2_identifier;SOF2_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(194);if (!vs2.equals(SOF2_identifier)) return noMatch();addSubSequence("SOF2");return true; }
private boolean parseSOF3() throws java.io.IOException {markStart();long SOF3_identifier;SOF3_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(195);if (!vs2.equals(SOF3_identifier)) return noMatch();addSubSequence("SOF3");return true; }
private boolean parseAPPX() throws java.io.IOException {markStart();long APPX_identifier;APPX_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(224, 239);if (!vs2.equals(APPX_identifier)) return noMatch();addSubSequence("APPX");return true; }
private boolean parseCOM() throws java.io.IOException {markStart();long COM_identifier;COM_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(254);if (!vs2.equals(COM_identifier)) return noMatch();addSubSequence("COM");return true; }
private boolean parseCOMElanGmk() throws java.io.IOException {markStart();long COMElanGmk_identifier;COMElanGmk_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(254);if (!vs2.equals(COMElanGmk_identifier)) return noMatch();long COMElanGmk_data;COMElanGmk_data = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs5 = new org.derric_lang.validator.ValueSet();vs5.addEquals(83);if (!vs5.equals(COMElanGmk_data)) return noMatch();long COMElanGmk_data_s2;COMElanGmk_data_s2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs8 = new org.derric_lang.validator.ValueSet();vs8.addEquals(78);if (!vs8.equals(COMElanGmk_data_s2)) return noMatch();long COMElanGmk_data_s3;COMElanGmk_data_s3 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs11 = new org.derric_lang.validator.ValueSet();vs11.addEquals(32);if (!vs11.equals(COMElanGmk_data_s3)) return noMatch();long COMElanGmk_data_s4;COMElanGmk_data_s4 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs14 = new org.derric_lang.validator.ValueSet();vs14.addEquals(49);if (!vs14.equals(COMElanGmk_data_s4)) return noMatch();long COMElanGmk_data_s5;COMElanGmk_data_s5 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs17 = new org.derric_lang.validator.ValueSet();vs17.addEquals(54);if (!vs17.equals(COMElanGmk_data_s5)) return noMatch();long COMElanGmk_data_s6;COMElanGmk_data_s6 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs20 = new org.derric_lang.validator.ValueSet();vs20.addEquals(53);if (!vs20.equals(COMElanGmk_data_s6)) return noMatch();long COMElanGmk_data_s7;COMElanGmk_data_s7 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs23 = new org.derric_lang.validator.ValueSet();vs23.addEquals(45);if (!vs23.equals(COMElanGmk_data_s7)) return noMatch();long COMElanGmk_data_s8;COMElanGmk_data_s8 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs26 = new org.derric_lang.validator.ValueSet();vs26.addEquals(50);if (!vs26.equals(COMElanGmk_data_s8)) return noMatch();long COMElanGmk_data_s9;COMElanGmk_data_s9 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs29 = new org.derric_lang.validator.ValueSet();vs29.addEquals(48);if (!vs29.equals(COMElanGmk_data_s9)) return noMatch();long COMElanGmk_data_s10;COMElanGmk_data_s10 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs32 = new org.derric_lang.validator.ValueSet();vs32.addEquals(49);if (!vs32.equals(COMElanGmk_data_s10)) return noMatch();long COMElanGmk_data_s11;COMElanGmk_data_s11 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs35 = new org.derric_lang.validator.ValueSet();vs35.addEquals(48);if (!vs35.equals(COMElanGmk_data_s11)) return noMatch();long COMElanGmk_data_s12;COMElanGmk_data_s12 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs38 = new org.derric_lang.validator.ValueSet();vs38.addEquals(54);if (!vs38.equals(COMElanGmk_data_s12)) return noMatch();long COMElanGmk_data_s13;COMElanGmk_data_s13 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs41 = new org.derric_lang.validator.ValueSet();vs41.addEquals(45);if (!vs41.equals(COMElanGmk_data_s13)) return noMatch();long COMElanGmk_data_s14;COMElanGmk_data_s14 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs44 = new org.derric_lang.validator.ValueSet();vs44.addEquals(48);if (!vs44.equals(COMElanGmk_data_s14)) return noMatch();long COMElanGmk_data_s15;COMElanGmk_data_s15 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs47 = new org.derric_lang.validator.ValueSet();vs47.addEquals(50);if (!vs47.equals(COMElanGmk_data_s15)) return noMatch();long COMElanGmk_data_s16;COMElanGmk_data_s16 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs50 = new org.derric_lang.validator.ValueSet();vs50.addEquals(44);if (!vs50.equals(COMElanGmk_data_s16)) return noMatch();long COMElanGmk_data_s17;COMElanGmk_data_s17 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs53 = new org.derric_lang.validator.ValueSet();vs53.addEquals(32);if (!vs53.equals(COMElanGmk_data_s17)) return noMatch();long COMElanGmk_data_s18;COMElanGmk_data_s18 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs56 = new org.derric_lang.validator.ValueSet();vs56.addEquals(69);if (!vs56.equals(COMElanGmk_data_s18)) return noMatch();long COMElanGmk_data_s19;COMElanGmk_data_s19 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs59 = new org.derric_lang.validator.ValueSet();vs59.addEquals(108);if (!vs59.equals(COMElanGmk_data_s19)) return noMatch();long COMElanGmk_data_s20;COMElanGmk_data_s20 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs62 = new org.derric_lang.validator.ValueSet();vs62.addEquals(97);if (!vs62.equals(COMElanGmk_data_s20)) return noMatch();long COMElanGmk_data_s21;COMElanGmk_data_s21 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs65 = new org.derric_lang.validator.ValueSet();vs65.addEquals(110);if (!vs65.equals(COMElanGmk_data_s21)) return noMatch();long COMElanGmk_data_s22;COMElanGmk_data_s22 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs68 = new org.derric_lang.validator.ValueSet();vs68.addEquals(32);if (!vs68.equals(COMElanGmk_data_s22)) return noMatch();long COMElanGmk_data_s23;COMElanGmk_data_s23 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs71 = new org.derric_lang.validator.ValueSet();vs71.addEquals(71);if (!vs71.equals(COMElanGmk_data_s23)) return noMatch();long COMElanGmk_data_s24;COMElanGmk_data_s24 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs74 = new org.derric_lang.validator.ValueSet();vs74.addEquals(109);if (!vs74.equals(COMElanGmk_data_s24)) return noMatch();long COMElanGmk_data_s25;COMElanGmk_data_s25 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs77 = new org.derric_lang.validator.ValueSet();vs77.addEquals(107);if (!vs77.equals(COMElanGmk_data_s25)) return noMatch();long COMElanGmk_data_2;COMElanGmk_data_2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs80 = new org.derric_lang.validator.ValueSet();vs80.addEquals(13);if (!vs80.equals(COMElanGmk_data_2)) return noMatch();long COMElanGmk_data_3;COMElanGmk_data_3 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs83 = new org.derric_lang.validator.ValueSet();vs83.addEquals(10);if (!vs83.equals(COMElanGmk_data_3)) return noMatch();long COMElanGmk_data_4;COMElanGmk_data_4 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs86 = new org.derric_lang.validator.ValueSet();vs86.addEquals(73);if (!vs86.equals(COMElanGmk_data_4)) return noMatch();long COMElanGmk_data_4_s2;COMElanGmk_data_4_s2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs89 = new org.derric_lang.validator.ValueSet();vs89.addEquals(110);if (!vs89.equals(COMElanGmk_data_4_s2)) return noMatch();long COMElanGmk_data_4_s3;COMElanGmk_data_4_s3 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs92 = new org.derric_lang.validator.ValueSet();vs92.addEquals(116);if (!vs92.equals(COMElanGmk_data_4_s3)) return noMatch();long COMElanGmk_data_4_s4;COMElanGmk_data_4_s4 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs95 = new org.derric_lang.validator.ValueSet();vs95.addEquals(101);if (!vs95.equals(COMElanGmk_data_4_s4)) return noMatch();long COMElanGmk_data_4_s5;COMElanGmk_data_4_s5 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs98 = new org.derric_lang.validator.ValueSet();vs98.addEquals(114);if (!vs98.equals(COMElanGmk_data_4_s5)) return noMatch();long COMElanGmk_data_4_s6;COMElanGmk_data_4_s6 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs101 = new org.derric_lang.validator.ValueSet();vs101.addEquals(110);if (!vs101.equals(COMElanGmk_data_4_s6)) return noMatch();long COMElanGmk_data_4_s7;COMElanGmk_data_4_s7 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs104 = new org.derric_lang.validator.ValueSet();vs104.addEquals(97);if (!vs104.equals(COMElanGmk_data_4_s7)) return noMatch();long COMElanGmk_data_4_s8;COMElanGmk_data_4_s8 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs107 = new org.derric_lang.validator.ValueSet();vs107.addEquals(108);if (!vs107.equals(COMElanGmk_data_4_s8)) return noMatch();long COMElanGmk_data_4_s9;COMElanGmk_data_4_s9 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs110 = new org.derric_lang.validator.ValueSet();vs110.addEquals(32);if (!vs110.equals(COMElanGmk_data_4_s9)) return noMatch();long COMElanGmk_data_4_s10;COMElanGmk_data_4_s10 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs113 = new org.derric_lang.validator.ValueSet();vs113.addEquals(117);if (!vs113.equals(COMElanGmk_data_4_s10)) return noMatch();long COMElanGmk_data_4_s11;COMElanGmk_data_4_s11 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs116 = new org.derric_lang.validator.ValueSet();vs116.addEquals(115);if (!vs116.equals(COMElanGmk_data_4_s11)) return noMatch();long COMElanGmk_data_4_s12;COMElanGmk_data_4_s12 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs119 = new org.derric_lang.validator.ValueSet();vs119.addEquals(101);if (!vs119.equals(COMElanGmk_data_4_s12)) return noMatch();long COMElanGmk_data_4_s13;COMElanGmk_data_4_s13 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs122 = new org.derric_lang.validator.ValueSet();vs122.addEquals(32);if (!vs122.equals(COMElanGmk_data_4_s13)) return noMatch();long COMElanGmk_data_4_s14;COMElanGmk_data_4_s14 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs125 = new org.derric_lang.validator.ValueSet();vs125.addEquals(111);if (!vs125.equals(COMElanGmk_data_4_s14)) return noMatch();long COMElanGmk_data_4_s15;COMElanGmk_data_4_s15 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs128 = new org.derric_lang.validator.ValueSet();vs128.addEquals(110);if (!vs128.equals(COMElanGmk_data_4_s15)) return noMatch();long COMElanGmk_data_4_s16;COMElanGmk_data_4_s16 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs131 = new org.derric_lang.validator.ValueSet();vs131.addEquals(108);if (!vs131.equals(COMElanGmk_data_4_s16)) return noMatch();long COMElanGmk_data_4_s17;COMElanGmk_data_4_s17 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs134 = new org.derric_lang.validator.ValueSet();vs134.addEquals(121);if (!vs134.equals(COMElanGmk_data_4_s17)) return noMatch();long COMElanGmk_data_5;COMElanGmk_data_5 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs137 = new org.derric_lang.validator.ValueSet();vs137.addEquals(13);if (!vs137.equals(COMElanGmk_data_5)) return noMatch();long COMElanGmk_data_6;COMElanGmk_data_6 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs140 = new org.derric_lang.validator.ValueSet();vs140.addEquals(10);if (!vs140.equals(COMElanGmk_data_6)) return noMatch();long COMElanGmk_data_7;COMElanGmk_data_7 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs143 = new org.derric_lang.validator.ValueSet();vs143.addEquals(78);if (!vs143.equals(COMElanGmk_data_7)) return noMatch();long COMElanGmk_data_7_s2;COMElanGmk_data_7_s2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs146 = new org.derric_lang.validator.ValueSet();vs146.addEquals(111);if (!vs146.equals(COMElanGmk_data_7_s2)) return noMatch();long COMElanGmk_data_7_s3;COMElanGmk_data_7_s3 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs149 = new org.derric_lang.validator.ValueSet();vs149.addEquals(116);if (!vs149.equals(COMElanGmk_data_7_s3)) return noMatch();long COMElanGmk_data_7_s4;COMElanGmk_data_7_s4 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs152 = new org.derric_lang.validator.ValueSet();vs152.addEquals(32);if (!vs152.equals(COMElanGmk_data_7_s4)) return noMatch();long COMElanGmk_data_7_s5;COMElanGmk_data_7_s5 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs155 = new org.derric_lang.validator.ValueSet();vs155.addEquals(102);if (!vs155.equals(COMElanGmk_data_7_s5)) return noMatch();long COMElanGmk_data_7_s6;COMElanGmk_data_7_s6 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs158 = new org.derric_lang.validator.ValueSet();vs158.addEquals(111);if (!vs158.equals(COMElanGmk_data_7_s6)) return noMatch();long COMElanGmk_data_7_s7;COMElanGmk_data_7_s7 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs161 = new org.derric_lang.validator.ValueSet();vs161.addEquals(114);if (!vs161.equals(COMElanGmk_data_7_s7)) return noMatch();long COMElanGmk_data_7_s8;COMElanGmk_data_7_s8 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs164 = new org.derric_lang.validator.ValueSet();vs164.addEquals(32);if (!vs164.equals(COMElanGmk_data_7_s8)) return noMatch();long COMElanGmk_data_7_s9;COMElanGmk_data_7_s9 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs167 = new org.derric_lang.validator.ValueSet();vs167.addEquals(114);if (!vs167.equals(COMElanGmk_data_7_s9)) return noMatch();long COMElanGmk_data_7_s10;COMElanGmk_data_7_s10 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs170 = new org.derric_lang.validator.ValueSet();vs170.addEquals(101);if (!vs170.equals(COMElanGmk_data_7_s10)) return noMatch();long COMElanGmk_data_7_s11;COMElanGmk_data_7_s11 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs173 = new org.derric_lang.validator.ValueSet();vs173.addEquals(115);if (!vs173.equals(COMElanGmk_data_7_s11)) return noMatch();long COMElanGmk_data_7_s12;COMElanGmk_data_7_s12 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs176 = new org.derric_lang.validator.ValueSet();vs176.addEquals(97);if (!vs176.equals(COMElanGmk_data_7_s12)) return noMatch();long COMElanGmk_data_7_s13;COMElanGmk_data_7_s13 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs179 = new org.derric_lang.validator.ValueSet();vs179.addEquals(108);if (!vs179.equals(COMElanGmk_data_7_s13)) return noMatch();long COMElanGmk_data_7_s14;COMElanGmk_data_7_s14 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs182 = new org.derric_lang.validator.ValueSet();vs182.addEquals(101);if (!vs182.equals(COMElanGmk_data_7_s14)) return noMatch();long COMElanGmk_data_8;COMElanGmk_data_8 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs185 = new org.derric_lang.validator.ValueSet();vs185.addEquals(0);if (!vs185.equals(COMElanGmk_data_8)) return noMatch();addSubSequence("COMElanGmk");return true; }
private boolean parseCOMASC() throws java.io.IOException {markStart();long COMASC_identifier;COMASC_identifier = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(254);if (!vs2.equals(COMASC_identifier)) return noMatch();long COMASC_length;COMASC_length = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(16);org.derric_lang.validator.ValueSet vs5 = new org.derric_lang.validator.ValueSet();vs5.addEquals(26);if (!vs5.equals(COMASC_length)) return noMatch();long COMASC_data;COMASC_data = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs8 = new org.derric_lang.validator.ValueSet();vs8.addEquals(67);if (!vs8.equals(COMASC_data)) return noMatch();long COMASC_data_s2;COMASC_data_s2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs11 = new org.derric_lang.validator.ValueSet();vs11.addEquals(114);if (!vs11.equals(COMASC_data_s2)) return noMatch();long COMASC_data_s3;COMASC_data_s3 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs14 = new org.derric_lang.validator.ValueSet();vs14.addEquals(101);if (!vs14.equals(COMASC_data_s3)) return noMatch();long COMASC_data_s4;COMASC_data_s4 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs17 = new org.derric_lang.validator.ValueSet();vs17.addEquals(97);if (!vs17.equals(COMASC_data_s4)) return noMatch();long COMASC_data_s5;COMASC_data_s5 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs20 = new org.derric_lang.validator.ValueSet();vs20.addEquals(116);if (!vs20.equals(COMASC_data_s5)) return noMatch();long COMASC_data_s6;COMASC_data_s6 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs23 = new org.derric_lang.validator.ValueSet();vs23.addEquals(101);if (!vs23.equals(COMASC_data_s6)) return noMatch();long COMASC_data_s7;COMASC_data_s7 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs26 = new org.derric_lang.validator.ValueSet();vs26.addEquals(100);if (!vs26.equals(COMASC_data_s7)) return noMatch();long COMASC_data_s8;COMASC_data_s8 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs29 = new org.derric_lang.validator.ValueSet();vs29.addEquals(32);if (!vs29.equals(COMASC_data_s8)) return noMatch();long COMASC_data_s9;COMASC_data_s9 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs32 = new org.derric_lang.validator.ValueSet();vs32.addEquals(98);if (!vs32.equals(COMASC_data_s9)) return noMatch();long COMASC_data_s10;COMASC_data_s10 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs35 = new org.derric_lang.validator.ValueSet();vs35.addEquals(121);if (!vs35.equals(COMASC_data_s10)) return noMatch();long COMASC_data_s11;COMASC_data_s11 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs38 = new org.derric_lang.validator.ValueSet();vs38.addEquals(32);if (!vs38.equals(COMASC_data_s11)) return noMatch();long COMASC_data_s12;COMASC_data_s12 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs41 = new org.derric_lang.validator.ValueSet();vs41.addEquals(65);if (!vs41.equals(COMASC_data_s12)) return noMatch();long COMASC_data_s13;COMASC_data_s13 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs44 = new org.derric_lang.validator.ValueSet();vs44.addEquals(99);if (!vs44.equals(COMASC_data_s13)) return noMatch();long COMASC_data_s14;COMASC_data_s14 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs47 = new org.derric_lang.validator.ValueSet();vs47.addEquals(99);if (!vs47.equals(COMASC_data_s14)) return noMatch();long COMASC_data_s15;COMASC_data_s15 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs50 = new org.derric_lang.validator.ValueSet();vs50.addEquals(117);if (!vs50.equals(COMASC_data_s15)) return noMatch();long COMASC_data_s16;COMASC_data_s16 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs53 = new org.derric_lang.validator.ValueSet();vs53.addEquals(83);if (!vs53.equals(COMASC_data_s16)) return noMatch();long COMASC_data_s17;COMASC_data_s17 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs56 = new org.derric_lang.validator.ValueSet();vs56.addEquals(111);if (!vs56.equals(COMASC_data_s17)) return noMatch();long COMASC_data_s18;COMASC_data_s18 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs59 = new org.derric_lang.validator.ValueSet();vs59.addEquals(102);if (!vs59.equals(COMASC_data_s18)) return noMatch();long COMASC_data_s19;COMASC_data_s19 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs62 = new org.derric_lang.validator.ValueSet();vs62.addEquals(116);if (!vs62.equals(COMASC_data_s19)) return noMatch();long COMASC_data_s20;COMASC_data_s20 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs65 = new org.derric_lang.validator.ValueSet();vs65.addEquals(32);if (!vs65.equals(COMASC_data_s20)) return noMatch();long COMASC_data_s21;COMASC_data_s21 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs68 = new org.derric_lang.validator.ValueSet();vs68.addEquals(67);if (!vs68.equals(COMASC_data_s21)) return noMatch();long COMASC_data_s22;COMASC_data_s22 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs71 = new org.derric_lang.validator.ValueSet();vs71.addEquals(111);if (!vs71.equals(COMASC_data_s22)) return noMatch();long COMASC_data_s23;COMASC_data_s23 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs74 = new org.derric_lang.validator.ValueSet();vs74.addEquals(114);if (!vs74.equals(COMASC_data_s23)) return noMatch();long COMASC_data_s24;COMASC_data_s24 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs77 = new org.derric_lang.validator.ValueSet();vs77.addEquals(112);if (!vs77.equals(COMASC_data_s24)) return noMatch();long COMASC_data_s25;COMASC_data_s25 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs80 = new org.derric_lang.validator.ValueSet();vs80.addEquals(46);if (!vs80.equals(COMASC_data_s25)) return noMatch();long COMASC_data_2;COMASC_data_2 = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs83 = new org.derric_lang.validator.ValueSet();vs83.addEquals(0);if (!vs83.equals(COMASC_data_2)) return noMatch();addSubSequence("COMASC");return true; }
private boolean parseEOI() throws java.io.IOException {markStart();long EOI_marker;EOI_marker = _input.unsigned().byteOrder(BIG_ENDIAN).readInteger(8);org.derric_lang.validator.ValueSet vs2 = new org.derric_lang.validator.ValueSet();vs2.addEquals(217);if (!vs2.equals(EOI_marker)) return noMatch();addSubSequence("EOI");return true; }

}