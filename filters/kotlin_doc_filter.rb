module KotlinDocFilter
  def html(fqn)
    html = ""
    fqn.each_char { |c|
      if (/[[:upper:]]/.match(c))
        html.concat("-")
        html.concat(c.downcase)
      else
        html.concat(c)
      end
    }
    return html
  end
end

Liquid::Template.register_filter(KotlinDocFilter);