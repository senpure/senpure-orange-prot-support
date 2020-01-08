// Generated from E:/Projects/senpure-orange-prot-support/src/main/resources\Java8Parser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java8ParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java8ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Java8ParserParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(Java8ParserParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(Java8ParserParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(Java8ParserParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(Java8ParserParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(Java8ParserParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(Java8ParserParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(Java8ParserParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(Java8ParserParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(Java8ParserParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(Java8ParserParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(Java8ParserParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(Java8ParserParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(Java8ParserParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(Java8ParserParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(Java8ParserParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(Java8ParserParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(Java8ParserParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(Java8ParserParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(Java8ParserParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(Java8ParserParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(Java8ParserParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(Java8ParserParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(Java8ParserParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(Java8ParserParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(Java8ParserParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(Java8ParserParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(Java8ParserParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(Java8ParserParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(Java8ParserParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(Java8ParserParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(Java8ParserParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(Java8ParserParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(Java8ParserParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(Java8ParserParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(Java8ParserParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(Java8ParserParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(Java8ParserParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(Java8ParserParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(Java8ParserParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Java8ParserParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(Java8ParserParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(Java8ParserParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(Java8ParserParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(Java8ParserParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(Java8ParserParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(Java8ParserParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(Java8ParserParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Java8ParserParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(Java8ParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(Java8ParserParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(Java8ParserParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(Java8ParserParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(Java8ParserParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(Java8ParserParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(Java8ParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(Java8ParserParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(Java8ParserParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(Java8ParserParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(Java8ParserParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(Java8ParserParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(Java8ParserParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(Java8ParserParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(Java8ParserParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(Java8ParserParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(Java8ParserParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(Java8ParserParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(Java8ParserParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(Java8ParserParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Java8ParserParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(Java8ParserParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(Java8ParserParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(Java8ParserParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(Java8ParserParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(Java8ParserParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(Java8ParserParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(Java8ParserParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(Java8ParserParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(Java8ParserParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(Java8ParserParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(Java8ParserParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(Java8ParserParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(Java8ParserParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(Java8ParserParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(Java8ParserParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(Java8ParserParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(Java8ParserParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(Java8ParserParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(Java8ParserParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(Java8ParserParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(Java8ParserParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(Java8ParserParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(Java8ParserParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(Java8ParserParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(Java8ParserParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(Java8ParserParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(Java8ParserParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(Java8ParserParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(Java8ParserParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(Java8ParserParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(Java8ParserParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(Java8ParserParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(Java8ParserParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(Java8ParserParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(Java8ParserParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(Java8ParserParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(Java8ParserParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(Java8ParserParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(Java8ParserParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(Java8ParserParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(Java8ParserParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(Java8ParserParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(Java8ParserParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(Java8ParserParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(Java8ParserParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(Java8ParserParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(Java8ParserParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(Java8ParserParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(Java8ParserParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(Java8ParserParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(Java8ParserParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(Java8ParserParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(Java8ParserParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(Java8ParserParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(Java8ParserParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Java8ParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(Java8ParserParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(Java8ParserParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(Java8ParserParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(Java8ParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Java8ParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(Java8ParserParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(Java8ParserParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(Java8ParserParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(Java8ParserParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(Java8ParserParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(Java8ParserParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(Java8ParserParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(Java8ParserParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(Java8ParserParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(Java8ParserParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(Java8ParserParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(Java8ParserParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(Java8ParserParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(Java8ParserParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(Java8ParserParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(Java8ParserParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(Java8ParserParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(Java8ParserParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(Java8ParserParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(Java8ParserParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(Java8ParserParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(Java8ParserParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(Java8ParserParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(Java8ParserParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(Java8ParserParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(Java8ParserParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(Java8ParserParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(Java8ParserParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(Java8ParserParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(Java8ParserParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(Java8ParserParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(Java8ParserParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(Java8ParserParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(Java8ParserParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(Java8ParserParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(Java8ParserParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(Java8ParserParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(Java8ParserParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(Java8ParserParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(Java8ParserParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(Java8ParserParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(Java8ParserParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(Java8ParserParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(Java8ParserParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Java8ParserParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(Java8ParserParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(Java8ParserParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(Java8ParserParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(Java8ParserParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(Java8ParserParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(Java8ParserParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(Java8ParserParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(Java8ParserParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(Java8ParserParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(Java8ParserParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(Java8ParserParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(Java8ParserParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(Java8ParserParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(Java8ParserParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(Java8ParserParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(Java8ParserParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(Java8ParserParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(Java8ParserParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(Java8ParserParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(Java8ParserParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(Java8ParserParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(Java8ParserParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Java8ParserParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(Java8ParserParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(Java8ParserParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(Java8ParserParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(Java8ParserParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(Java8ParserParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(Java8ParserParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(Java8ParserParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Java8ParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(Java8ParserParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(Java8ParserParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(Java8ParserParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(Java8ParserParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(Java8ParserParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(Java8ParserParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(Java8ParserParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(Java8ParserParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(Java8ParserParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(Java8ParserParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(Java8ParserParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(Java8ParserParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(Java8ParserParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(Java8ParserParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(Java8ParserParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(Java8ParserParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(Java8ParserParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(Java8ParserParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(Java8ParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(Java8ParserParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(Java8ParserParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(Java8ParserParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(Java8ParserParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(Java8ParserParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(Java8ParserParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(Java8ParserParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(Java8ParserParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(Java8ParserParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8ParserParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(Java8ParserParser.CastExpressionContext ctx);
}