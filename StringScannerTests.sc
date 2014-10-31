StringScannerTests : Test {
	test_exampleUsage {
		var s;
		s = StringScanner.new("This is an example string");
		this.assertEqual( "This", s.scan("\\w+") );
		this.assertEqual( nil, s.scan("\\w+") );
		this.assertEqual( " ", s.scan("\\s+") );
		this.assertEqual( nil, s.scan("\\s+") );
		this.assertEqual( "is", s.scan("\\w+") );
		this.assertFalse( s.eos );

		this.assertEqual( " ", s.scan("\\s+") );
		this.assertEqual( "an", s.scan("\\w+") );
		this.assertEqual( " ", s.scan("\\s+") );
		this.assertEqual( "example", s.scan("\\w+") );
		this.assertEqual( " ", s.scan("\\s+") );
		this.assertEqual( "string", s.scan("\\w+") );
		this.assert( s.eos );

		this.assertEqual( nil, s.scan("\\w+") );
		this.assertEqual( nil, s.scan("\\s+") );
	}
}
