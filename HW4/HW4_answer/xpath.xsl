<xsl:stylesheet version="2.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fn="http://www.w3.org/2005/02/xpath-functions">

  <xsl:output method="html"/>

  <xsl:template match="/">


  
    <html>
      <body bgcolor="#FFFFFF">
	  
        <h1>Retrieve selected elements</h1>
        Total price from the same city Dallas: 
		
		<!--
		<xsl:for-each select="/book/bookinformation">
		    <xsl:if test="publisherinformation/publisheraddress/city = 'Dallas'">
		     <b> true </b>
	    -->
		
		<ul><li><xsl:value-of select="number(/book/bookinformation[1]/cost) + number(/book/bookinformation[2]/cost)"/></li></ul>
		<!-- </xsl:if> 		
		</xsl:for-each> -->
		
		
        Attributes of book whose price is in (25, 100): 
		<xsl:for-each select="/book/bookinformation[cost &gt; 25 and cost &lt; 100]">
	<!--	  <xsl:if test="cost &gt; 25 and cost &lt; 100"> -->
		  <ul><li>title: <xsl:value-of select="title"/>, author: <xsl:value-of select="author"/>, publication date: <xsl:value-of select="publicationdate"/></li></ul>
	<!--	  </xsl:if> -->
		</xsl:for-each>
		
	<!--    <date varDate="31/12/1999" />
		<if test="year(@varDate)>=1900">
		true
		</if>  -->
	<!--
		<xsl:if test="substring(/book/bookinformation[1]/publicationdate, 1, 4) > 2018">
        true
        </xsl:if> -->
			
		
		Authors whose book have published after 2010: 
		<xsl:for-each select="/book/bookinformation[substring(publicationdate, 1, 4)&gt; 2010]">
		<ul><li>author: <xsl:value-of select="author"/></li></ul>
        </xsl:for-each>
		
		
		<!-- wrong
		<xsl:for-each select="/book/bookinformation[year-from-date(xs:date("publicationdate")) > 2010]">
		<xsl:if test="year-from-dateTime(xs:dateTime("publicationdate")) &gt; 2010">
		  <ul><li>author: <xsl:value-of select="author"/></li></ul>
		</xsl:if>
		</xsl:for-each>
		-->
      </body>
    </html>
  </xsl:template>


</xsl:stylesheet>
