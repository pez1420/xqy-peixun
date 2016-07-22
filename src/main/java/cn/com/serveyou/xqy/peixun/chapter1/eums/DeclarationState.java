package cn.com.serveyou.xqy.peixun.chapter1.eums;

//申报状态
public enum DeclarationState {
	UNFILLED("0", "未填写"), 
	UNDECLARED("1", "未申报"), 
	DECLARING("2", "申报中"), 
	DECLARED_FAILED("3", "申报失败"),
	CANCELLING("4", "作废中"), 
	DECLARED_SUCCESSFUL("5", "申报成功"), 
	UNWITHHOLDED("6", "未缴款"), 
	WITHHOLDED("7", "已缴款") ;

	private String code;

	private String desc;

	private DeclarationState(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
    public static DeclarationState getDeclarationState(String code) {
        for (DeclarationState declarationState : values()) {
            if (declarationState.getCode().equals(code)) {
                return declarationState;
            }
        }
        return UNFILLED;
    }
}
