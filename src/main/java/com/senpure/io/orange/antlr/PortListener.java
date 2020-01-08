// Generated from E:/Projects/senpure-orange-prot-support/src/main/resources\Port.g4 by ANTLR 4.7.2
package com.senpure.io.orange.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PortParser}.
 */
public interface PortListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PortParser#protocol}.
	 * @param ctx the parse tree
	 */
	void enterProtocol(PortParser.ProtocolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#protocol}.
	 * @param ctx the parse tree
	 */
	void exitProtocol(PortParser.ProtocolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(PortParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(PortParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#bean}.
	 * @param ctx the parse tree
	 */
	void enterBean(PortParser.BeanContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#bean}.
	 * @param ctx the parse tree
	 */
	void exitBean(PortParser.BeanContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(PortParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(PortParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(PortParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(PortParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#response}.
	 * @param ctx the parse tree
	 */
	void enterResponse(PortParser.ResponseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#response}.
	 * @param ctx the parse tree
	 */
	void exitResponse(PortParser.ResponseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#messageName}.
	 * @param ctx the parse tree
	 */
	void enterMessageName(PortParser.MessageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#messageName}.
	 * @param ctx the parse tree
	 */
	void exitMessageName(PortParser.MessageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#beanName}.
	 * @param ctx the parse tree
	 */
	void enterBeanName(PortParser.BeanNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#beanName}.
	 * @param ctx the parse tree
	 */
	void exitBeanName(PortParser.BeanNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(PortParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(PortParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PortParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PortParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(PortParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(PortParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(PortParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(PortParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(PortParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(PortParser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#entityComment}.
	 * @param ctx the parse tree
	 */
	void enterEntityComment(PortParser.EntityCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#entityComment}.
	 * @param ctx the parse tree
	 */
	void exitEntityComment(PortParser.EntityCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#fieldComment}.
	 * @param ctx the parse tree
	 */
	void enterFieldComment(PortParser.FieldCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#fieldComment}.
	 * @param ctx the parse tree
	 */
	void exitFieldComment(PortParser.FieldCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PortParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(PortParser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PortParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(PortParser.FieldTypeContext ctx);
}