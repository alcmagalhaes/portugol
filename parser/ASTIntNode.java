/* Generated By:JJTree: Do not edit this line. ASTIntNode.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
public class ASTIntNode extends SimpleNode {
  public ASTIntNode(int id) {
    super(id);
  }

  public ASTIntNode(PortugolParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PortugolParserVisitor visitor, Object data) throws Exception {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=36910d2267831ac0f2f6ea2c699cc0a4 (do not edit this line) */
