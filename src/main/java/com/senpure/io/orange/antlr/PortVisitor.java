// Generated from E:/Projects/senpure-orange-prot-support/src/main/resources\Port.g4 by ANTLR 4.7.2
package com.senpure.io.orange.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PortParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PortVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PortParser#protocol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol(PortParser.ProtocolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(PortParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#bean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBean(PortParser.BeanContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(PortParser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#request}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequest(PortParser.RequestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#response}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponse(PortParser.ResponseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#messageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageName(PortParser.MessageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#beanName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeanName(PortParser.BeanNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(PortParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PortParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(PortParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(PortParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#fieldName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldName(PortParser.FieldNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#entityComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityComment(PortParser.EntityCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#fieldComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldComment(PortParser.FieldCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PortParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldType(PortParser.FieldTypeContext ctx);
}