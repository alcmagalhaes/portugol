/* Generated By:JJTree&JavaCC: Do not edit this line. PortugolParserTokenManager.java */

/** Token Manager. */
public class PortugolParserTokenManager implements PortugolParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x40000000000000L) != 0L)
            return 12;
         if ((active0 & 0x2000000000000L) != 0L)
            return 17;
         if ((active0 & 0x880940000L) != 0L)
            return 1;
         if ((active0 & 0x700000777f6bffc0L) != 0L)
         {
            jjmatchedKind = 63;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0x1248280000L) != 0L)
            return 1;
         if ((active0 & 0x70000065b7d7ffc0L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 63;
               jjmatchedPos = 1;
            }
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x6413413000L) != 0L)
            return 1;
         if ((active0 & 0x70000003e4b6cfc0L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 63;
               jjmatchedPos = 2;
            }
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x30000006e2f6cf40L) != 0L)
         {
            jjmatchedKind = 63;
            jjmatchedPos = 3;
            return 1;
         }
         if ((active0 & 0x4000000104000080L) != 0L)
            return 1;
         return -1;
      case 4:
         if ((active0 & 0x10000006c2868640L) != 0L)
         {
            jjmatchedKind = 63;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x2000000020704900L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x10000006c2868240L) != 0L)
         {
            jjmatchedKind = 63;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x400L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0x1000000442840200L) != 0L)
         {
            jjmatchedKind = 63;
            jjmatchedPos = 6;
            return 1;
         }
         if ((active0 & 0x280028040L) != 0L)
            return 1;
         return -1;
      case 7:
         if ((active0 & 0x1000000402040000L) != 0L)
         {
            jjmatchedKind = 63;
            jjmatchedPos = 7;
            return 1;
         }
         if ((active0 & 0x40800200L) != 0L)
            return 1;
         return -1;
      case 8:
         if ((active0 & 0x1000000402000000L) != 0L)
         {
            jjmatchedKind = 63;
            jjmatchedPos = 8;
            return 1;
         }
         if ((active0 & 0x40000L) != 0L)
            return 1;
         return -1;
      case 9:
         if ((active0 & 0x1000000400000000L) != 0L)
            return 1;
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 63;
            jjmatchedPos = 9;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 59);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 37:
         return jjStopAtPos(0, 50);
      case 40:
         return jjStopAtPos(0, 51);
      case 41:
         return jjStopAtPos(0, 52);
      case 42:
         return jjStopAtPos(0, 48);
      case 43:
         return jjStopAtPos(0, 46);
      case 44:
         return jjStopAtPos(0, 53);
      case 45:
         return jjStopAtPos(0, 47);
      case 46:
         return jjStartNfaWithStates_0(0, 54, 12);
      case 47:
         return jjStartNfaWithStates_0(0, 49, 17);
      case 60:
         jjmatchedKind = 43;
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 61:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 62:
         jjmatchedKind = 42;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 91:
         return jjStopAtPos(0, 55);
      case 93:
         return jjStopAtPos(0, 56);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x100000a00L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x208000000L);
      case 101:
         jjmatchedKind = 35;
         return jjMoveStringLiteralDfa1_0(0x80940000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2000000403410000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x8040L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4000004000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x24000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x22080L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x40280000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x1000000000005000L);
      case 120:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 123:
         return jjStopAtPos(0, 57);
      case 125:
         return jjStopAtPos(0, 58);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(1, 41);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         else if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(1, 45);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000004125005200L);
      case 101:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000240222180L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x402410000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x900040L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000c00L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x80040000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 117:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 36, 1);
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 101:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 28, 1);
         break;
      case 102:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000400L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x6000000000000000L);
      case 109:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x402400000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x200800L);
      case 111:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 38, 1);
         break;
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 113:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000004000200L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x120000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x160040L);
      case 117:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 37, 1);
         break;
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 122:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(2, 24, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x300200L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000000000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x602000040L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x4400L);
      case 108:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 1);
         break;
      case 111:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 1);
         else if ((active0 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 62, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x80028000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000020400800L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x40800000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000800000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x600L);
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(4, 22, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x240000040L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
      case 111:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 1);
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(4, 14, 1);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(4, 20, 1);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 1);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 1);
         else if ((active0 & 0x2000000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 61, 1);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x28000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 1);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000000000L);
      case 104:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x40820000L);
      case 111:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 1);
         break;
      case 113:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x200048200L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 1);
         else if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(6, 17, 1);
         break;
      case 101:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(6, 31, 1);
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000000200L);
      case 111:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(6, 6, 1);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(6, 33, 1);
         return jjMoveStringLiteralDfa7_0(active0, 0x400000000L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x40800000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x2040000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x2000000L);
      case 101:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(7, 30, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000000000000L);
      case 108:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000000L);
      case 111:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(7, 23, 1);
         break;
      case 114:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(7, 9, 1);
         return jjMoveStringLiteralDfa8_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(8, 18, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa9_0(active0, 0x400000000L);
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x2000000L);
      case 114:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(9, 34, 1);
         break;
      case 111:
         if ((active0 & 0x1000000000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 60, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x2000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(10, 25, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 26;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 17:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(21, 22);
                  else if (curChar == 47)
                     jjCheckNAddTwoStates(18, 19);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 66)
                        kind = 66;
                     jjCheckNAddTwoStates(8, 9);
                  }
                  else if (curChar == 47)
                     jjAddStates(0, 1);
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(14, 15);
                  else if (curChar == 46)
                     jjCheckNAdd(12);
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 3;
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 65)
                        kind = 65;
                     jjCheckNAdd(6);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 65)
                        kind = 65;
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if (curChar == 39 && kind > 64)
                     kind = 64;
                  break;
               case 5:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 65)
                     kind = 65;
                  jjCheckNAdd(6);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 65)
                     kind = 65;
                  jjCheckNAdd(6);
                  break;
               case 7:
                  if (curChar == 48 && kind > 65)
                     kind = 65;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 66)
                     kind = 66;
                  jjCheckNAddTwoStates(8, 9);
                  break;
               case 9:
                  if (curChar == 46)
                     jjCheckNAdd(10);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 66)
                     kind = 66;
                  jjCheckNAdd(10);
                  break;
               case 11:
                  if (curChar == 46)
                     jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 66)
                     kind = 66;
                  jjCheckNAdd(12);
                  break;
               case 13:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(14, 15);
                  break;
               case 14:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(14, 15);
                  break;
               case 15:
                  if (curChar == 34 && kind > 67)
                     kind = 67;
                  break;
               case 16:
                  if (curChar == 47)
                     jjAddStates(0, 1);
                  break;
               case 18:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(18, 19);
                  break;
               case 19:
                  if (curChar == 10 && kind > 4)
                     kind = 4;
                  break;
               case 20:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(21, 22);
                  break;
               case 21:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(21, 22);
                  break;
               case 22:
                  if (curChar == 42)
                     jjAddStates(2, 3);
                  break;
               case 23:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(24, 22);
                  break;
               case 24:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(24, 22);
                  break;
               case 25:
                  if (curChar == 47 && kind > 5)
                     kind = 5;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 1:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 63)
                     kind = 63;
                  jjCheckNAdd(1);
                  break;
               case 3:
                  jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 14:
                  jjAddStates(4, 5);
                  break;
               case 18:
                  jjAddStates(6, 7);
                  break;
               case 21:
                  jjCheckNAddTwoStates(21, 22);
                  break;
               case 23:
               case 24:
                  jjCheckNAddTwoStates(24, 22);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 14:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(4, 5);
                  break;
               case 18:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(6, 7);
                  break;
               case 21:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(21, 22);
                  break;
               case 23:
               case 24:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(24, 22);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 26 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   17, 20, 23, 25, 14, 15, 18, 19, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\151\156\164\145\151\162\157", 
"\162\145\141\154", "\164\145\170\164\157", "\143\141\162\141\143\164\145\162", 
"\154\157\147\151\143\157", "\143\157\156\163\164", "\166\141\162", "\162\145\146", 
"\166\141\172\151\157", "\151\155\160\157\162\164\141", "\146\151\155", 
"\162\145\164\157\162\156\141", "\145\163\164\162\165\164\165\162\141", "\163\145", "\145\156\164\141\157", 
"\163\145\156\141\157", "\146\151\155\163\145", "\145\156\161\165\141\156\164\157", "\146\141\172", 
"\146\151\155\145\156\161\165\141\156\164\157", "\160\141\162\141", "\144\145", "\141\164\145", "\160\141\163\163\157", 
"\163\145\147\165\151\156\164\145", "\145\163\143\157\154\150\145", "\143\141\163\157", 
"\144\145\146\145\151\164\157", "\146\151\155\145\163\143\157\154\150\145", "\145", "\157\165", 
"\170\157\165", "\156\141\157", "\75", "\76\75", "\74\75", "\76", "\74", "\75\75", "\41\75", 
"\53", "\55", "\52", "\57", "\45", "\50", "\51", "\54", "\56", "\133", "\135", 
"\173", "\175", "\12", "\166\145\162\144\141\144\145\151\162\157", 
"\146\141\154\163\157", "\156\165\154\157", null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffffffffc1L, 0xfL, 
};
static final long[] jjtoSkip = {
   0x3eL, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[26];
private final int[] jjstateSet = new int[52];
protected char curChar;
/** Constructor. */
public PortugolParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public PortugolParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 26; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
