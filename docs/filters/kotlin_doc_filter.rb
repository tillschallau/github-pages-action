module KotlinDocFilter
    def html(fqn)
		html = ""
		fqn.each_char{ |c|
			if(/[[:upper:]]/.match(c)){
				html += "-" + c.downcase
			}else{
				html += c
			}
		}
		return html
    end
end

Liquid::Template.register_filter(KotlinDocFilter)