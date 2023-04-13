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
					<th> PAIS</th>
					<th> ESTILO</th>
				</tr>
					<xsl:for-each select="pintores/pintor[apellidos!='Dalí']">
					<xsl:sort select="apellidos"/>
						<tr>
							<td><xsl:value-of select="nombre"/></td>
							<td><xsl:value-of select="apellidos"/></td>
							<td><xsl:value-of select="pais"/></td>
							<td><xsl:value-of select="estilo"/></td>
						</tr>
					</xsl:for-each>
			</table>
		
		</body>
	</html>	
</xsl:template>
</xsl:stylesheet>