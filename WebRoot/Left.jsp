<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript" src="dtree/dtree.js"></script>

<table width="100%" border="0">
	<tr>
		<td colspan="2"><script type="text/javascript">				
						
						d = new dTree('d');
						d.add(0,-1,'');
				       
				       	d.add(10000,0,'系统设置');
						
						d.add(10100,10000,'权限设置');
						
						d.add(10101,10100,'用户维护','UsergetAll','用户维护','mainFrame');
						d.add(10102,10100,'权限维护','auth/AuthgetAll','权限维护','mainFrame');
						d.add(10103,10100,'角色维护','role/RolegetAll','角色维护','mainFrame');
						
						
						d.add(20000,0,'新闻中心');
				       
						<c:forEach items="${leftAuths }" var="parAuth">
							<c:if test="${parAuth.authIsRoot == '是' }">
								d.add('${parAuth.auth_Id }',20000,'${parAuth.authName }');
								<c:forEach items="${leftAuths }" var="sonAuth">
									<c:if test="${sonAuth.authIsRoot == '否' }">
										<c:if test="${sonAuth.authParentRoot == parAuth.auth_Id }">
											d.add('${sonAuth.auth_Id }','${parAuth.auth_Id }','${sonAuth.authName }','${sonAuth.authUrl }','${sonAuth.authName }','mainFrame');
										</c:if>
									</c:if>
								</c:forEach>
							</c:if>
						</c:forEach>
						
						
						
						document.write(d);

				
				</script></td>
	</tr>
</table>

