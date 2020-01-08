// Generated from E:/Projects/senpure-orange-prot-support/src/main/resources\Java8Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java8ParserParser}.
 */
public interface Java8ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Java8ParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Java8ParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(Java8ParserParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(Java8ParserParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(Java8ParserParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(Java8ParserParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(Java8ParserParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(Java8ParserParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(Java8ParserParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(Java8ParserParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(Java8ParserParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(Java8ParserParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(Java8ParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(Java8ParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(Java8ParserParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(Java8ParserParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(Java8ParserParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(Java8ParserParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(Java8ParserParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(Java8ParserParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(Java8ParserParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(Java8ParserParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(Java8ParserParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(Java8ParserParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(Java8ParserParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(Java8ParserParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(Java8ParserParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(Java8ParserParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(Java8ParserParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(Java8ParserParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(Java8ParserParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(Java8ParserParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(Java8ParserParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(Java8ParserParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(Java8ParserParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(Java8ParserParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(Java8ParserParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(Java8ParserParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(Java8ParserParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(Java8ParserParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(Java8ParserParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(Java8ParserParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(Java8ParserParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(Java8ParserParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(Java8ParserParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(Java8ParserParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(Java8ParserParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(Java8ParserParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(Java8ParserParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(Java8ParserParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(Java8ParserParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(Java8ParserParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(Java8ParserParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(Java8ParserParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(Java8ParserParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(Java8ParserParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(Java8ParserParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(Java8ParserParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(Java8ParserParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(Java8ParserParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(Java8ParserParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(Java8ParserParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(Java8ParserParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(Java8ParserParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(Java8ParserParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(Java8ParserParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(Java8ParserParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(Java8ParserParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(Java8ParserParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(Java8ParserParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(Java8ParserParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(Java8ParserParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(Java8ParserParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(Java8ParserParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(Java8ParserParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(Java8ParserParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(Java8ParserParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(Java8ParserParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(Java8ParserParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(Java8ParserParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Java8ParserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Java8ParserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(Java8ParserParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(Java8ParserParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(Java8ParserParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(Java8ParserParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(Java8ParserParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(Java8ParserParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(Java8ParserParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(Java8ParserParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(Java8ParserParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(Java8ParserParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(Java8ParserParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(Java8ParserParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(Java8ParserParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(Java8ParserParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(Java8ParserParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(Java8ParserParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(Java8ParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(Java8ParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(Java8ParserParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(Java8ParserParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(Java8ParserParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(Java8ParserParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(Java8ParserParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(Java8ParserParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(Java8ParserParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(Java8ParserParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(Java8ParserParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(Java8ParserParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(Java8ParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(Java8ParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(Java8ParserParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(Java8ParserParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(Java8ParserParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(Java8ParserParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(Java8ParserParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(Java8ParserParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(Java8ParserParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(Java8ParserParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(Java8ParserParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(Java8ParserParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(Java8ParserParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(Java8ParserParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(Java8ParserParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(Java8ParserParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(Java8ParserParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(Java8ParserParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(Java8ParserParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(Java8ParserParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(Java8ParserParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(Java8ParserParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8ParserParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8ParserParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(Java8ParserParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(Java8ParserParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(Java8ParserParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(Java8ParserParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Java8ParserParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Java8ParserParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(Java8ParserParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(Java8ParserParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(Java8ParserParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(Java8ParserParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(Java8ParserParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(Java8ParserParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(Java8ParserParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(Java8ParserParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(Java8ParserParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(Java8ParserParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(Java8ParserParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(Java8ParserParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(Java8ParserParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(Java8ParserParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(Java8ParserParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(Java8ParserParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(Java8ParserParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(Java8ParserParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(Java8ParserParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(Java8ParserParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(Java8ParserParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(Java8ParserParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(Java8ParserParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(Java8ParserParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(Java8ParserParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(Java8ParserParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(Java8ParserParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(Java8ParserParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(Java8ParserParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(Java8ParserParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(Java8ParserParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(Java8ParserParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(Java8ParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(Java8ParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(Java8ParserParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(Java8ParserParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(Java8ParserParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(Java8ParserParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(Java8ParserParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(Java8ParserParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(Java8ParserParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(Java8ParserParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(Java8ParserParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(Java8ParserParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(Java8ParserParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(Java8ParserParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(Java8ParserParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(Java8ParserParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(Java8ParserParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(Java8ParserParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(Java8ParserParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(Java8ParserParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(Java8ParserParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(Java8ParserParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(Java8ParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(Java8ParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(Java8ParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(Java8ParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(Java8ParserParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(Java8ParserParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(Java8ParserParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(Java8ParserParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(Java8ParserParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(Java8ParserParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(Java8ParserParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(Java8ParserParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(Java8ParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(Java8ParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(Java8ParserParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(Java8ParserParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(Java8ParserParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(Java8ParserParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(Java8ParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(Java8ParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(Java8ParserParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(Java8ParserParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(Java8ParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(Java8ParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(Java8ParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(Java8ParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(Java8ParserParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(Java8ParserParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(Java8ParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(Java8ParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(Java8ParserParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(Java8ParserParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(Java8ParserParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(Java8ParserParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(Java8ParserParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(Java8ParserParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(Java8ParserParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(Java8ParserParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(Java8ParserParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(Java8ParserParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(Java8ParserParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(Java8ParserParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(Java8ParserParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(Java8ParserParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(Java8ParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(Java8ParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(Java8ParserParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(Java8ParserParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(Java8ParserParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(Java8ParserParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(Java8ParserParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(Java8ParserParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(Java8ParserParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(Java8ParserParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(Java8ParserParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(Java8ParserParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Java8ParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Java8ParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(Java8ParserParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(Java8ParserParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(Java8ParserParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(Java8ParserParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(Java8ParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(Java8ParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(Java8ParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(Java8ParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Java8ParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Java8ParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(Java8ParserParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(Java8ParserParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(Java8ParserParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(Java8ParserParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(Java8ParserParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(Java8ParserParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(Java8ParserParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(Java8ParserParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(Java8ParserParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(Java8ParserParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(Java8ParserParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(Java8ParserParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(Java8ParserParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(Java8ParserParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(Java8ParserParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(Java8ParserParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(Java8ParserParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(Java8ParserParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(Java8ParserParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(Java8ParserParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(Java8ParserParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(Java8ParserParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(Java8ParserParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(Java8ParserParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(Java8ParserParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(Java8ParserParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(Java8ParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(Java8ParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(Java8ParserParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(Java8ParserParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(Java8ParserParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(Java8ParserParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(Java8ParserParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(Java8ParserParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(Java8ParserParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(Java8ParserParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(Java8ParserParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(Java8ParserParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(Java8ParserParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(Java8ParserParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(Java8ParserParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(Java8ParserParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(Java8ParserParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(Java8ParserParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(Java8ParserParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(Java8ParserParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(Java8ParserParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(Java8ParserParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(Java8ParserParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(Java8ParserParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(Java8ParserParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(Java8ParserParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(Java8ParserParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(Java8ParserParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(Java8ParserParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(Java8ParserParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(Java8ParserParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(Java8ParserParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(Java8ParserParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(Java8ParserParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(Java8ParserParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(Java8ParserParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(Java8ParserParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(Java8ParserParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(Java8ParserParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(Java8ParserParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(Java8ParserParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(Java8ParserParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(Java8ParserParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(Java8ParserParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(Java8ParserParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(Java8ParserParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(Java8ParserParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(Java8ParserParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(Java8ParserParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(Java8ParserParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(Java8ParserParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(Java8ParserParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(Java8ParserParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(Java8ParserParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(Java8ParserParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(Java8ParserParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(Java8ParserParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(Java8ParserParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(Java8ParserParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(Java8ParserParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(Java8ParserParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(Java8ParserParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Java8ParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Java8ParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(Java8ParserParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(Java8ParserParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(Java8ParserParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(Java8ParserParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(Java8ParserParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(Java8ParserParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(Java8ParserParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(Java8ParserParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8ParserParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8ParserParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8ParserParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8ParserParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(Java8ParserParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(Java8ParserParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8ParserParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8ParserParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8ParserParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8ParserParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(Java8ParserParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(Java8ParserParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(Java8ParserParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(Java8ParserParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(Java8ParserParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(Java8ParserParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(Java8ParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(Java8ParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(Java8ParserParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(Java8ParserParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(Java8ParserParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(Java8ParserParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(Java8ParserParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(Java8ParserParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(Java8ParserParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(Java8ParserParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(Java8ParserParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(Java8ParserParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(Java8ParserParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(Java8ParserParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(Java8ParserParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(Java8ParserParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(Java8ParserParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(Java8ParserParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(Java8ParserParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(Java8ParserParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(Java8ParserParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(Java8ParserParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(Java8ParserParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(Java8ParserParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(Java8ParserParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(Java8ParserParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(Java8ParserParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(Java8ParserParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(Java8ParserParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(Java8ParserParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(Java8ParserParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(Java8ParserParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(Java8ParserParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(Java8ParserParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(Java8ParserParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(Java8ParserParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Java8ParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Java8ParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(Java8ParserParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(Java8ParserParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(Java8ParserParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(Java8ParserParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(Java8ParserParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(Java8ParserParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(Java8ParserParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(Java8ParserParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(Java8ParserParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(Java8ParserParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Java8ParserParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Java8ParserParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(Java8ParserParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(Java8ParserParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(Java8ParserParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(Java8ParserParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(Java8ParserParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(Java8ParserParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(Java8ParserParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(Java8ParserParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(Java8ParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(Java8ParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(Java8ParserParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(Java8ParserParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(Java8ParserParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(Java8ParserParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(Java8ParserParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(Java8ParserParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(Java8ParserParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(Java8ParserParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(Java8ParserParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(Java8ParserParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(Java8ParserParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(Java8ParserParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(Java8ParserParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(Java8ParserParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(Java8ParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(Java8ParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(Java8ParserParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(Java8ParserParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(Java8ParserParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(Java8ParserParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(Java8ParserParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(Java8ParserParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(Java8ParserParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(Java8ParserParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(Java8ParserParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(Java8ParserParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(Java8ParserParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(Java8ParserParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(Java8ParserParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(Java8ParserParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(Java8ParserParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(Java8ParserParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(Java8ParserParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(Java8ParserParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8ParserParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(Java8ParserParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8ParserParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(Java8ParserParser.CastExpressionContext ctx);
}