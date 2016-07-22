package cn.com.serveyou.xqy.peixun.chapter1.eums;

//�걨״̬
public enum DeclarationState {
	UNFILLED("0", "δ��д"), 
	UNDECLARED("1", "δ�걨"), 
	DECLARING("2", "�걨��"), 
	DECLARED_FAILED("3", "�걨ʧ��"),
	CANCELLING("4", "������"), 
	DECLARED_SUCCESSFUL("5", "�걨�ɹ�"), 
	UNWITHHOLDED("6", "δ�ɿ�"), 
	WITHHOLDED("7", "�ѽɿ�") ;

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
