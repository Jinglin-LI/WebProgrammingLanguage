<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version="1.0">

  <xsl:output method="html"/>

  <xsl:template match="/">
    <html>
      <body bgcolor="#FFFFFF">
        <h1>Retrieve selected elements</h1>
        Here is the name of participant two: 
        <ul><li><xsl:value-of select=".//participant[2]/FirstName"/></li></ul>
        Here are all participant's firstnames that have a food preference: 
        <ul><xsl:apply-templates select=".//participant[FoodPref]"/></ul>
        Here are all items that have a value of "high"
        <ul><xsl:apply-templates select=".//item[@val='high']"/></ul>
      </body>
    </html>
  </xsl:template>

<xsl:template match="participant">
  <li><xsl:value-of select="FirstName"/></li>
</xsl:template>

<xsl:template match="item">
  <li><xsl:value-of select="."/></li>
</xsl:template>

</xsl:stylesheet>
