<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
	<html>
	<head>
		<meta charset="utf-8"/>
		<title>consultas xslt</title>
		<!--<link rel="stylesheet" type="text/css" href="estilos.css"/> podemos poner css externas-->
	</head>
		<body>
			<h1 >PINTORES</h1>
			<table border ="2">
				<tr style="background:#887788">
					<th> NOMBRE PINTOR</th>
					<th> APELLIDOS</th>
					<th> CUADROS</th>
				</tr>
				<tr>
					<xsl:choose>
						<xsl:when test="año_nacimiento &lt;1700>
							<td style="background:#ff0000"><xsl:value-of select="nombre"/></td>
							<td><xsl:value-of select="apellidos"/></td>
							<td><xsl:value-of select="año_nacimiento"/></td>
					</xsl:choose>
				</tr>
			</table>
		</body>
	</html>	
</xsl:template>
</xsl:stylesheet>