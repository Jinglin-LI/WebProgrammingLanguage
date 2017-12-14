
<xsl:stylesheet version="2.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:template match="/">
    <xsl:variable name="dateValue" select="'2012-03-19'"/>
    <xsl:variable name="year" select="year-from-date(xs:date($dateValue))"/>
    <xsl:value-of select="$year"/>
  </xsl:template>

</xsl:stylesheet>